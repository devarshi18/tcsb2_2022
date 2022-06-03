package demo.Employee.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.Employee.Entity.Employee;
import demo.Employee.Repository.EmployeeRep;
import demo.Employee.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	
	EmployeeRep employeeRep;
	
	public Employee addEmp(Employee emp) {
		Employee e = employeeRep.save(emp);
		
		return e;
	}


	public Employee updateEmp(Employee emp, Integer id) {
		emp.setId(id);
		Employee upE = employeeRep.save(emp);
		
		return upE;
	}


	public List<Employee> listOfEmp() {

		List<Employee> listE = employeeRep.findAll();
		return listE;
	}


	
	public void deletEmp(Integer id) {
		employeeRep.deleteById(id);	
		
	}


	
	}
	

	
	


