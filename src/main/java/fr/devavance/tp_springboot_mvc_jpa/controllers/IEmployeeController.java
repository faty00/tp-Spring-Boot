package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public interface IEmployeeController {
       // public String displayHome(Model model);
        public String addEmployee(Employee employee);
        //public String displayEmployee(Long id,  Model model);
    }


