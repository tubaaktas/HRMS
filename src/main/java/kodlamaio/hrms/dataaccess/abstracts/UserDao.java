package kodlamaio.hrms.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.abstracts.User;

@Repository
public interface UserDao extends JpaRepository<User,Integer>{

}
