package tn.rach.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.rach.proj.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}
