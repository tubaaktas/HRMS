package kodlamaio.hrms.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
