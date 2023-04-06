package tn.rach.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.rach.proj.entities.Command; 

public interface CommandRepository extends JpaRepository<Command, Integer>{
    
}
