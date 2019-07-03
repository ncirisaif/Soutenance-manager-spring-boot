package com.spring.soutenance.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    private long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String niveau;
    private String specialite;
    private String password;
    private String phone;
    private String userName;



}
