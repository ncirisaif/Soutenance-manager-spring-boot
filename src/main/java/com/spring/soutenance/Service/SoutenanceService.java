package com.spring.soutenance.Service;

import com.spring.soutenance.domain.Soutenance;

import java.util.Collection;
import java.util.Optional;

public interface SoutenanceService {

    Soutenance saveSoutenance(Soutenance soutenance);

    Soutenance updateSoutenance(Soutenance soutenance);

    void deleteSoutenance(Soutenance soutenance);

    Optional<Soutenance> findSoutenance(Soutenance soutenance);

    Optional<Soutenance> findSoutenancetById(long id);

    Collection<Soutenance> findAll();

    void deleteSoutenanceById(long id);
}

