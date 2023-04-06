package tn.rach.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.rach.proj.entities.UserInformations;

public interface UserInformationsRepository extends JpaRepository<UserInformations, Integer>{
    
}
