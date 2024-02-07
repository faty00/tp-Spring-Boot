package fr.devavance.tp_springboot_mvc_jpa.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {


    /*
    *la methode getTemplate1
    * renvoie une chaine de caractere
     */
    @RequestMapping("/")  //fabrication de reponses '/ definit la racine de l'  App
    public String getTemplate1(Model model) {
        model.addAttribute( "name","Capteur température");
        return "template1";

    }
}
