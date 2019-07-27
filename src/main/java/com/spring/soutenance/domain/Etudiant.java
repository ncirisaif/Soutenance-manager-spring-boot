package com.spring.soutenance.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant extends UserApp {
    @ManyToOne
    @JoinColumn
    private Projet projet;
    private String niveau;
    private String specialite;


}
