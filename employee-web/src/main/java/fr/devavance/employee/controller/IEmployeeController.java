package fr.devavance.employee.controller;

import fr.devavance.employee.core.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public interface IEmployeeController {
    public String displayHome(Model model);
    public String addEmployee(Employee employee);
    public String displayEmployee(Long id,  Model model);

}