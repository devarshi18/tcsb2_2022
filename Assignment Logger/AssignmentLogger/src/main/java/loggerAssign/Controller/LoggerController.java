package loggerAssign.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import loggerAssign.Entity.LoggerEntity;
import loggerAssign.Service.LoggerService;

@RestController
public class LoggerController {
	
	private static final Logger log = LoggerFactory.getLogger(LoggerController.class);
	
	@Autowired
	LoggerService loggerService;
	
	@PostMapping(value="/create")
	
	LoggerEntity addLog(@RequestBody LoggerEntity lE) {
		log.info("******** in LoggerController class********"+lE.getProdName());
		log.info("******** in LoggerController class********"+lE.getProdPrice());
		LoggerEntity addL = loggerService.createLog(lE);
		log.info(" ******** in after called service class**** ");
		
		return addL;
		
	}


}
