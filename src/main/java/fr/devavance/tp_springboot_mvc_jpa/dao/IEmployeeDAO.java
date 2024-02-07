package fr.devavance.tp_springboot_mvc_jpa.dao;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;

import java.util.ArrayList;

public interface IEmployeeDAO {

    public ArrayList<Employee> employeesList = new ArrayList<>();


    /*
    *renvoie une liste d’employées et ne possédant pas de paramètre,
     */
    public abstract ArrayList<Employee> findAll();


    /*
    * prend un employée en paramètre et ne retourne pas de valeur.
     */
    public abstract void add(Employee employee) ;

}
