package com.spring.soutenance.Service;

import com.spring.soutenance.DAO.SalleRepository;
import com.spring.soutenance.domain.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class SalleServiceImpl implements SalleService {
    @Autowired
    SalleRepository salleRepository;
    @Override
    public Salle saveSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public Salle updateSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public void deleteSalle(Salle salle) {
        salleRepository.deleteById(salle.getId());
    }

    @Override
    public Optional<Salle> findSalle(Salle salle) {
        return salleRepository.findById(salle.getId());
    }

    @Override
    public Optional<Salle> findSalletById(long id) {
        return salleRepository.findById(id);
    }

    @Override
    public Collection<Salle> findAll() {
        return salleRepository.findAll();
    }

    @Override
    public void deleteSalleById(long id) {
        salleRepository.deleteById(id);

    }
}
