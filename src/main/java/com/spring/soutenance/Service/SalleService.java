package com.spring.soutenance.Service;

import com.spring.soutenance.domain.Salle;

import java.util.Collection;
import java.util.Optional;

public interface SalleService {
    Salle saveSalle(Salle salle);

    Salle updateSalle(Salle salle);

    void deleteSalle(Salle salle);

    Optional<Salle> findSalle(Salle salle);

    Optional<Salle> findSalletById(long id);

    Collection<Salle> findAll();

    void deleteSalleById(long id);
}
