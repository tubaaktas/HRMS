package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

	private DepartmentService departmentService;

	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Department>> getAll(){
		return this.departmentService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Department department) {
		return this.departmentService.add(department);
	}
	
}
