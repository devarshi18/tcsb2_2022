package validassign.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import validassign.model.Employee;
import validassign.service.EmployeeService;

@RestController
@RequestMapping("/apigateway/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService userService;
	
	@PostMapping("employee")
	public ResponseEntity<Employee> createUser(@Valid @RequestBody Employee user){
		Employee savedUser = userService.createUser(user);
		return new ResponseEntity<Employee>(savedUser, HttpStatus.CREATED);
	}

}
