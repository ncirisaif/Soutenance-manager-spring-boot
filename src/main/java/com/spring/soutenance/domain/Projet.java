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
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    private Enseignant enseignant;

    @OneToMany(mappedBy = "projet")
    private Collection<Etudiant> etudiants = new ArrayList<>();



    //unique = true enforces the unique constraint, 1 soutenance belongs to only 1 projet
    //defines foreign key column and indicates the owner of the relationship


}
