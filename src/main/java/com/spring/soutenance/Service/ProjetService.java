package com.spring.soutenance.Service;

import com.spring.soutenance.domain.Projet;

import java.util.Collection;
import java.util.Optional;

public interface ProjetService {
    Projet saveProjet(Projet projet);

    Projet updateProjet(Projet projet);

    void deleteProjet(Projet projet);

    Optional<Projet> findProjet(Projet projet);

    Optional<Projet> findProjetById(long id);

    Collection<Projet> findAll();

    void deleteProjetById(long id);

}
