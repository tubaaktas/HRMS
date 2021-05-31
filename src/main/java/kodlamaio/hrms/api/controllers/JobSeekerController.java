package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekerController {
	
	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public List<JobSeeker> getAll(){
		return this.jobSeekerService.getAll();
	}

	@PostMapping("/register")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.register(jobSeeker);
	}

}
