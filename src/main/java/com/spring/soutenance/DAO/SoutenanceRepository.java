package com.spring.soutenance.DAO;

import com.spring.soutenance.domain.Soutenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoutenanceRepository extends JpaRepository<Soutenance,Long> {
}
