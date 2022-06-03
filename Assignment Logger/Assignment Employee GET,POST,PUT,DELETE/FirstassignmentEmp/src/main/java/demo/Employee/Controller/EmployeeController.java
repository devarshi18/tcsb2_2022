package demo.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.Employee.Entity.Employee;
import demo.Employee.Service.EmployeeService;

@RestController("/")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value="/addemp")
	Employee addEmp(@RequestBody Employee emp) {
		Employee p = employeeService.addEmp(emp);
		return p;
		}
	
	@PutMapping(value="/update/{id}")
	Employee upEmployee(@RequestBody Employee emp, @PathVariable Integer id) {
		employeeService.updateEmp(emp, id);
		return emp;
	}
	
	@GetMapping(value="/listofemployee")
	List<Employee> listOfEmp(){
		List<Employee> listP = employeeService.listOfEmp();
		return listP;
		
	}
	
	@DeleteMapping(value="/delete/{id}")
	String deleteEmp(@PathVariable Integer id) {
		employeeService.deletEmp(id);
		return "delete id no" + id;
	}
	
	
	
}