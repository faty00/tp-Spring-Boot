package fr.devavance.tp_springboot_mvc_jpa.beans;

public class Employee {


    public int id ; // identifiant unique de l’employé
    public String  name ; // nom de l’employé
    public String address ; // adresse postale de l’employé
    public String email ; // adresse de courriel de l’employé
    public String phone ; // numéro de téléphone de l’employé

    public int getId() {
        return id;
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
}
