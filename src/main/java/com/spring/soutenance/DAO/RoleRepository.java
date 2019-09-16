package com.spring.soutenance.DAO;

import com.spring.soutenance.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByRole(String nom);
=======
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByNomRole(String nom);
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
}
