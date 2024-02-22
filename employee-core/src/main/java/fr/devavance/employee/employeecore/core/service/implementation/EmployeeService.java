package fr.devavance.employee.employeecore.core.service.implementation;

import fr.devavance.employee.employeecore.core.entity.Employee;
import fr.devavance.employee.employeecore.core.repository.IEmployeeRepository;
import fr.devavance.employee.employeecore.core.service.IEmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private IEmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    // ...

}
