package com.spring.soutenance.Service;

import com.spring.soutenance.DAO.ProjetRepository;
import com.spring.soutenance.domain.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProjetServiceImpl implements ProjetService {

    @Autowired
    ProjetRepository projetRepository ;

    @Override
    public Projet saveProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void deleteProjet(Projet projet) {
            projetRepository.delete(projet);
    }

    @Override
    public Optional<Projet> findProjet(Projet projet) {
        return projetRepository.findById(projet.getId());
    }

    @Override
    public Optional<Projet> findProjetById(long id) {
        return projetRepository.findById(id);
    }

    @Override
    public Collection<Projet> findAll() {
        return projetRepository.findAll();
    }

    @Override
    public void deleteProjetById(long id) {
        projetRepository.deleteById(id);
    }
}
