package com.spring.soutenance.domain;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.soutenance.springsocial.model.AuthProvider;
=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
<<<<<<< HEAD
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
<<<<<<< HEAD
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "user_type")
 public  class UserApp  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phone;
    private String niveau;
    private String specialite;


    @Email
   @Column(nullable = false)
   private String email;

    @Column(nullable = false)
    private String name;

    private String imageUrl;

    @Column(nullable = false)
    private Boolean emailVerified = false;


    @NotNull
    @Enumerated(EnumType.STRING)
    private AuthProvider provider;

    private String providerId;



   @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id"),
=======
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "user_type")
 public abstract class UserApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String phone;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "userId"),
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
            inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "roleId"))
    private Collection<Role> userRoles = new ArrayList<>();


<<<<<<< HEAD


=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
}
