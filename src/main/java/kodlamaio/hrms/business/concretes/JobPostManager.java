package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPostService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.ErrorResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataaccess.abstracts.JobPostDao;
import kodlamaio.hrms.entities.concretes.JobPost;

@Service
public class JobPostManager implements JobPostService {

	private JobPostDao jobPostDao;

	@Autowired
	public JobPostManager(JobPostDao jobPostDao) {
		super();
		this.jobPostDao = jobPostDao;
	}

	@Override
	public DataResult<List<JobPost>> getAll() {
		return new SuccessDataResult<List<JobPost>>(this.jobPostDao.findAll(), "Veriler Getirildi.");
	}

	@Override
	public DataResult<List<JobPost>> getAllStatusTrue() {
		return new SuccessDataResult<List<JobPost>>(this.jobPostDao.findAllByStatusTrue());
	}

	@Override
	public DataResult<List<JobPost>> findAllByEmployer_IdAndStatusTrue(int employerId) {
		return new SuccessDataResult<List<JobPost>>(this.jobPostDao.findAllByEmployer_IdAndStatusTrue(employerId));
	}

	@Override
	public Result add(JobPost jobPost) {
		return new SuccessDataResult<JobPost>(this.jobPostDao.save(jobPost));
	}

	@Override
	public Result findById(int jobPostId, boolean status) {
		try {
			JobPost jobPost;
			jobPost = this.jobPostDao.findById(jobPostId).get();

			jobPost.setStatus(status);

			this.jobPostDao.save(jobPost);

			return new SuccessResult("İşlem Başarılı");

		} catch (Exception e) {
			return new ErrorResult("İşlem Başarısız");
		}
	}

	@Override
	public DataResult<List<JobPost>> findAllByStatusTrueSortedAsc() {
		return new SuccessDataResult<List<JobPost>>(this.jobPostDao.findAllByStatusTrueOrderByPostDateAsc(),
				"Verilerden Aktif Olanlar Tarihe Göre Listelendi");
	}

	@Override
	public DataResult<List<JobPost>> findAllByStatusTrueOrderByPostDateDesc() {
		return new SuccessDataResult<List<JobPost>>(this.jobPostDao.findAllByStatusTrueOrderByPostDateDesc(),
				"Verilerden Aktif Olanlar Tarihe Göre Listelendi");

	}

}
