package kodlamaio.hrms.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position,Integer>{

} 
