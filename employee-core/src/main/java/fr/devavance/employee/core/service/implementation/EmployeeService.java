package fr.devavance.employee.core.service.implementation;

import fr.devavance.employee.core.entity.Employee;
import fr.devavance.employee.core.repository.IEmployeeRepository;
import fr.devavance.employee.core.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private IEmployeeRepository repository;


    @Autowired
    public EmployeeService(IEmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public Employee findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }


}
