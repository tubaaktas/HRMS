package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.abstracts.CheckEmailService;
import kodlamaio.hrms.core.abstracts.EmailSendService;
import kodlamaio.hrms.core.abstracts.MernisCheckService;
import kodlamaio.hrms.core.utilities.ErrorResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataaccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private CheckEmailService emailCheckService;
	private MernisCheckService mernisCheckService;
	private EmailSendService emailSendService;
	private List<String> emails = new ArrayList<>();
	private List<String> identificationNumbers = new ArrayList<>();

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, CheckEmailService emailCheckService,
			MernisCheckService mernisCheckService, EmailSendService emailSendService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.emailCheckService = emailCheckService;
		this.mernisCheckService = mernisCheckService;
		this.emailSendService = emailSendService;
	}

	@Override
	public Result login(String email, String password) {
		Result result = new ErrorResult("Login unsuccessful !");
		for (int i = 0; i < jobSeekerDao.findAll().size(); i++) {
			if (jobSeekerDao.findAll().get(i).getEmail() == email
					&& jobSeekerDao.findAll().get(i).getPassword() == password) {
				result = new SuccessResult("Login successful !");
			}
		}
		return result;
	}

	@Override
	public Result register(JobSeeker jobSeeker) {
		Result result = new ErrorResult("Login unsuccessful !");
		if (emailCheckService.mailCheck(jobSeeker.getEmail()) && emailIsItUsed(jobSeeker.getEmail())
				&& tcNoIsItUsed(jobSeeker.getTcNo()) && mernisCheckService.checkIfRealPerson(jobSeeker)) {
			emailSendService.emailSend(jobSeeker.getEmail());
			this.jobSeekerDao.save(jobSeeker);
			result = new SuccessResult("Login successful !");
		}
		return result;
	}

	public boolean emailIsItUsed(String email) {
		boolean result = true;
		if (getAllEmails().contains(email)) {
			result = false;
		}
		return result;
	}

	public boolean tcNoIsItUsed(String TcNo) {
		boolean result = true;
		if (getAllTcNo().contains(TcNo)) {
			result = false;
		}
		return result;

	}

	@Override
	public List<String> getAllEmails() {
		for (int i = 0; i < getAll().size(); i++) {
			emails.add(getAll().get(i).getEmail());
		}
		return emails;
	}

	@Override
	public List<String> getAllTcNo() {
		for (int i = 0; i < getAll().size(); i++) {
			identificationNumbers.add(getAll().get(i).getTcNo());
		}
		return identificationNumbers;
	}

	@Override
	public List<JobSeeker> getAll() {
		return this.jobSeekerDao.findAll();
	}

}
