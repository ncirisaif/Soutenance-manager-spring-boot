package com.spring.soutenance.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD
@PasswordMatches
public class UserDto implements Serializable {

    private long id;

    private String firstName;
    private String lastName;

    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String role;

    private String niveau;

    private String specialite;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String confirmPassword;



=======
public class UserDto implements Serializable {
    private long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String niveau;
    private String specialite;
    private String password;
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
    private String phone;
    private String userName;



}
