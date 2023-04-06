package tn.rach.proj.controllers;

import tn.rach.proj.entities.Utilisateur;
import tn.rach.proj.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilisateurController {

@Autowired
UserService userService;
    @GetMapping("/afficherUtilisateur")
    @ResponseBody
    List<Utilisateur> afficherUtilisateur(){
        return  userService.afficherUtilisateur();
    }

    @GetMapping("/afficherUtilisateur/{id}")
    @ResponseBody
    Utilisateur afficherUtilisateur(@PathVariable("id")Long id) {
        return userService.retrieveUtilisateurById(id);
    }

    @PostMapping("/ajouterUtilisateur")
    Utilisateur ajouterUtilisateur( @RequestBody Utilisateur utilisateur) {
        return userService.addUtilisateur(utilisateur);
    }

}
