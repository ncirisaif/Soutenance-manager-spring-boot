package com.spring.soutenance.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roleId;
<<<<<<< HEAD
    private String role;
=======
    private String nomRole;
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb

}