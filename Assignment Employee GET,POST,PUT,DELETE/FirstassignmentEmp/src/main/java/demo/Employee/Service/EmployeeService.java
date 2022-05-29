package demo.Employee.Service;

import java.util.List;

import demo.Employee.Entity.Employee;

public interface EmployeeService {
	
	Employee addEmp(Employee emp) ;
	
	List<Employee> listOfEmp();
	
	Employee updateEmp(Employee emp, Integer id);
	
	void deletEmp(Integer id);
	
		

}
