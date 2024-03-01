package fr.devavance.employee.employeecore.core.repository;

import org.springframework.data.repository.CrudRepository;

import fr.devavance.employee.employeecore.core.entity.Employee;
import org.springframework.stereotype.Repository;




@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}