package com.spring.soutenance.DAO;

import com.spring.soutenance.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByNomRole(String nom);
}
