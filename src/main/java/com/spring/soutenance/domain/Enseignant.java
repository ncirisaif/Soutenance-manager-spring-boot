package com.spring.soutenance.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Enseignant extends UserApp {




    @OneToMany(mappedBy = "enseignant")
    private Collection<Projet> projets = new ArrayList<>();

    @ManyToMany(mappedBy = "jurys")
    private Collection<Soutenance> soutenances = new ArrayList<>();


}
