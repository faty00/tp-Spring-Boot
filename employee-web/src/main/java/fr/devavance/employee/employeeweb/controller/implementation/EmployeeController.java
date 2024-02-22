package fr.devavance.employee.employeeweb.controller.implementation;
import java.util.Optional;
import fr.devavance.employee.employeecore.core.entity.Employee;
import fr.devavance.employee.employeecore.core.repository.IEmployeeRepository;
import fr.devavance.employee.employeeweb.controller.IEmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String addEmployee(fr.devavance.employee.employeecore.core.entity.Employee employee){
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
