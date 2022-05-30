package loggerAssign.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import loggerAssign.Entity.LoggerEntity;

@Repository
public interface LoggerRepo extends JpaRepository<LoggerEntity, Long>{
	
	
	

}
