package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RequestMapping("/employee")
@org.springframework.stereotype.Controller
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeRepository employeeRepository;

/*
    @RequestMapping("/")
    public String findAllEmployee(Model model){
        model.addAttribute("employees",employeeRepository.findAll());
        model.addAttribute("employee", new Employee());
        return "view_home.html";

    }
*/

    @GetMapping("/home")
    public String displayHome(Model model) {
        model.addAttribute("employees",employeeRepository.findAll());
        model.addAttribute("employee", new Employee());
        return "view_home.html";

    }

    /*
        @GetMapping("/{id}")
        public String displayEmployee(@PathVariable(name = "id") Long id, Model model) {
            Optional<Employee> employee = employeeRepository.findById(id);
            model.addAttribute("employeeID", employee.orElse(null));
            return "view_employees";
        }

    */
    @PostMapping("/addemployee")
    public String addEmployee(Employee employee){
        employeeRepository.save(employee);
        return "redirect:/employee/home";
    }

    @RequestMapping(value = "/{id}")
    public String displayEmployee(@PathVariable(name = "id") Long id, Model model) {
        Optional<Employee> employee = employeeRepository.findById(id);
        model.addAttribute("employee", employee.get());
        return "view_employee";
    }
}
