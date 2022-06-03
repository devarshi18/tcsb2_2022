package demo.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.Employee.Entity.Employee;

@Repository
public interface EmployeeRep extends JpaRepository<Employee, Integer>{

}
