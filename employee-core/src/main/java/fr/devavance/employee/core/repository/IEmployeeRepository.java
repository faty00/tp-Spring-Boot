package fr.devavance.employee.core.repository;

import org.springframework.data.repository.CrudRepository;

import fr.devavance.employee.core.entity.Employee;
import org.springframework.stereotype.Repository;




@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
