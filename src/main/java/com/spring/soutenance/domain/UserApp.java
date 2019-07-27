package com.spring.soutenance.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "user_type")
 public  class UserApp  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phone;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "userId"),
            inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "roleId"))
    private Collection<Role> userRoles = new ArrayList<>();

/*
   public UserApp(UserApp user) {
        this.userName=user.getUserName();
        this.password=user.getPassword().toLowerCase();
       this.firstName = user.getFirstName();
       this.lastName = user.getLastName();
       this.phone = user.getPhone();
       this.email = user.getEmail();
       this.userId = user.userId;}*/




}
