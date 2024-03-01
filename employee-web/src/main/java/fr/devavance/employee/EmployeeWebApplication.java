package fr.devavance.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan("fr.devavance.employee")

public class EmployeeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeWebApplication.class, args);
    }

}

