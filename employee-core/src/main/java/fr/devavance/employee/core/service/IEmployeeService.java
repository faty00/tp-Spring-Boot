package fr.devavance.employee.core.service;

import fr.devavance.employee.core.entity.Employee;

import java.util.List;

public interface IEmployeeService {


        public List<Employee> findAll();
        public void save(Employee employee);
        public Employee findById(Long id);
        public void delete(Long id);

}
