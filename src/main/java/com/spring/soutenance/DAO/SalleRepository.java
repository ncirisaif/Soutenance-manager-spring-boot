package com.spring.soutenance.DAO;

import com.spring.soutenance.domain.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle,Long> {
}
