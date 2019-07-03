package com.spring.soutenance.Service;

import com.spring.soutenance.DAO.SoutenanceRepository;
import com.spring.soutenance.domain.Soutenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class SoutenceServiceImpl implements SoutenanceService {
    @Autowired
    SoutenanceRepository soutenanceRepository;

    @Override
    public Soutenance saveSoutenance(Soutenance soutenance) {
        soutenance.getSalle();
        return soutenanceRepository.save(soutenance);
    }

    @Override
    public Soutenance updateSoutenance(Soutenance soutenance) {
        return soutenanceRepository.save(soutenance);
    }

    @Override
    public void deleteSoutenance(Soutenance soutenance) {
        soutenanceRepository.delete(soutenance);
    }

    @Override
    public Optional<Soutenance> findSoutenance(Soutenance soutenance) {
        return soutenanceRepository.findById(soutenance.getSoutenanceId());
    }

    @Override
    public Optional<Soutenance> findSoutenancetById(long id) {
        return soutenanceRepository.findById(id);
    }

    @Override
    public Collection<Soutenance> findAll() {
        return soutenanceRepository.findAll();
    }

    @Override
    public void deleteSoutenanceById(long id) {
        soutenanceRepository.deleteById(id);
    }
}
