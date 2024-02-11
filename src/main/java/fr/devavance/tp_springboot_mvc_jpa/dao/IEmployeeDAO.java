package fr.devavance.tp_springboot_mvc_jpa.dao;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;

import java.util.ArrayList;

public interface IEmployeeDAO {

    /*
    *renvoie une liste d’employées et ne possédant pas de paramètre,
     */
    public ArrayList<Employee> findAll();

    /*
    * prend un employée en paramètre et ne retourne pas de valeur.
     */
    public void add(Employee employee) ;

}
