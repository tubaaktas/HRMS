package kodlamaio.hrms.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.abstracts.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
