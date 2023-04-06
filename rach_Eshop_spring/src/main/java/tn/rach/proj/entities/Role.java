package tn.rach.proj.entities;

import java.io.Serializable;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@Data@AllArgsConstructor@NoArgsConstructor
public class Role implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    private String RoleName;

    @JsonBackReference
    @ManyToMany (mappedBy = "roles" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private Collection<Utilisateur> utilisateurs ;

    public Collection<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
    public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateurs.add(utilisateur);
    }
}
