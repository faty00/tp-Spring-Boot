package fr.devavance.tp_springboot_mvc_jpa.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id ; // identifiant unique de l’employé
    public String  name ; // nom de l’employé
    public String address ; // adresse postale de l’employé
    public String email ; // adresse de courriel de l’employé
    public String phone ; // numéro de téléphone de l’employé

    private Fonction fonction;



    public Employee(){
    }


    public Employee(String name,  String email,String phone,String address,  Fonction fonction){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.fonction = fonction;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction){this.fonction = fonction;}

    public long getId(){
        return id;
    }
}




