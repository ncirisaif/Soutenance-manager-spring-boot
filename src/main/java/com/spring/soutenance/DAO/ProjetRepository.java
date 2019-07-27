package com.spring.soutenance.DAO;

import com.spring.soutenance.domain.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
}
