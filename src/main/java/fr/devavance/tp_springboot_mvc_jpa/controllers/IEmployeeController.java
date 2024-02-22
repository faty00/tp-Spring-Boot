package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public interface IEmployeeController {
        public String displayHome(Model model);
        public String addEmployee(Employee employee);
        public String displayEmployee(Long id,  Model model);

}




