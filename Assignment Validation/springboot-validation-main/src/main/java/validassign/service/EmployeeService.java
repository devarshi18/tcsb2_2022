package validassign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import validassign.model.Employee;
import validassign.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository eRepository;
	
	public Employee createUser(Employee user) {
		return eRepository.save(user);
	}	

}
