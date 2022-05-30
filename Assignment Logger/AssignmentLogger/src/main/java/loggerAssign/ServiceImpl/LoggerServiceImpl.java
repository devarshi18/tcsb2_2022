package loggerAssign.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import loggerAssign.Controller.LoggerController;
import loggerAssign.Entity.LoggerEntity;
import loggerAssign.Repository.LoggerRepo;
import loggerAssign.Service.LoggerService;

@Service
public class LoggerServiceImpl implements LoggerService{
	
	private static final Logger log = LoggerFactory.getLogger(LoggerController.class);
	
	@Autowired
	LoggerRepo loggerRepo;

	@Override
	public LoggerEntity createLog(LoggerEntity lE) {
		
		log.info("in service");
		
		LoggerEntity x = loggerRepo.save(lE);
		
		return x;
	}
	
	

}
