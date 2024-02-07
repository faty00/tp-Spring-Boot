package fr.devavance.tp_springboot_mvc_jpa.dao;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;

import java.util.ArrayList;

public class EmployeeDAOImpl implements IEmployeeDAO{

    public ArrayList<Employee> employeesList ;


    public ArrayList<Employee> findAll() {
        return employeesList;
    }

    public void setEmployeesList( ) {



        for (int i = 0; i < employeesList.size(); i++) ;


    }

    public void add(Employee employee) {
        employeesList.add(employee);

    }
}
