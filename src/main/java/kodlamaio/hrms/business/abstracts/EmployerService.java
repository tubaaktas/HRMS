package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	public Result login(String email, String password);

	public Result register(Employer employer);

	DataResult<List<Employer>> getAll();
	public List<String> getAllEmails();
}
