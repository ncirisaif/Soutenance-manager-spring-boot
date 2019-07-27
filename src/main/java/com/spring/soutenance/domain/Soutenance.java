package com.spring.soutenance.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Soutenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long soutenanceId;

    @OneToOne   //indicates the inverse of the relationship.
    private Projet projetSoutenanace;

    @ManyToOne
    @JoinColumn
    private Salle salle;

   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(name = "soutenance_enseignant",
            joinColumns = @JoinColumn(name = "id_soutenance"),
            inverseJoinColumns = @JoinColumn(name = "id_enseignant") )
    private Collection<Enseignant> jurys = new ArrayList<>();



}
