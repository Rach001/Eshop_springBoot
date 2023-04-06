package tn.rach.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.rach.proj.entities.CommandLine;

public interface CommandLineRepository extends JpaRepository<CommandLine, Integer> {
    
}
