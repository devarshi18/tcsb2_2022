package validassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import validassign.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
