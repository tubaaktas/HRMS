package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataaccess.abstracts.DepartmentDao;
import kodlamaio.hrms.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService{

	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}

	@Override
	public DataResult<List<Department>> getAll() {
		return new SuccessDataResult<List<Department>>
		(this.departmentDao.findAll(), "Department listed.") ;
	}

	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccessResult("Department added.");
	}

}
