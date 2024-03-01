package fr.devavance.employee.employeecore.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import fr.devavance.employee.employeecore.core.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import fr.devavance.employee.employeecore.core.entity.Employee;
import fr.devavance.employee.employeecore.core.enumeration.Fonction;

@Component
class InitDataRepository implements CommandLineRunner {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public void run(String... strings) throws Exception {
        // A compléter avec le remplissage de la base de données

        employeeRepository.save(new Employee("Karim Mahmoud", "kmshawky20@gmail.com", "0097450413948", "Egypt", Fonction.DEV_WEB));
        employeeRepository.save(new Employee("Fran Wilson", "franwilson@mail.com", "(204) 619-5731", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_OPS));
        employeeRepository.save(new Employee("Maria Anders", "mariaanders@mail.com", "(503) 555-9931", "25, rue Lauriston, Paris, France", Fonction.CHEF_PROJET));
        employeeRepository.save(new Employee("Thomas Hardy", "thomashardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_AI));
        employeeRepository.save(new Employee("Ahmed Omar", "amhedoomar@gmail.com", "0096650413948", "KSA", Fonction.SOFTWARE_ARCHITECT));
        employeeRepository.save(new Employee("Idam Wilson", "idamwilson@mail.com", "(204) 619-5331", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_AI));
        employeeRepository.save(new Employee("Peter Perrier", "peterperrier@mail.com", "(313) 555-5735", "Obere Str. 57, Berlin, Germany", Fonction.DEV_WEB));
        employeeRepository.save(new Employee("Mark Hardy", "markshardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_OPS));

    }
}