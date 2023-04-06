package tn.rach.proj.service;


import tn.rach.proj.Repository.RoleRepository;
import tn.rach.proj.Repository.UtilisateurRepository;
import tn.rach.proj.entities.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

@Autowired
    UtilisateurRepository utilisateurRepository;
@Autowired
    RoleRepository RoleRepository;

    public List<Utilisateur> afficherUtilisateur(){
        return utilisateurRepository.findAll();
    }

    public Utilisateur retrieveUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    public Utilisateur addUtilisateur(Utilisateur utilisateur ) {
        return  utilisateurRepository.save(utilisateur);
    }

}
