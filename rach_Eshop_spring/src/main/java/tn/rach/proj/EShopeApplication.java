package tn.rach.proj;


import tn.rach.proj.Repository.UtilisateurRepository;
import tn.rach.proj.entities.Utilisateur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EShopeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext test = SpringApplication.run(EShopeApplication.class, args);

        //User
        UtilisateurRepository userRepository = test.getBean(UtilisateurRepository.class);
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setLogin("test");
        utilisateur.setPassword("test");
        utilisateur.setConnectionNumber(0);
        userRepository.save(utilisateur);



    }
}
