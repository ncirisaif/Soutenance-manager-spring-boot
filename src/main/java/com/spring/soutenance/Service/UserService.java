package com.spring.soutenance.Service;

import com.spring.soutenance.DTO.UserDto;
import com.spring.soutenance.domain.UserApp;

import java.util.Collection;
import java.util.Optional;

public interface UserService {

    UserApp saveUser(UserDto userDto);

    UserApp updateUser(UserDto userDto,long id);

    void deleteUser(UserApp user);

    Optional<UserApp> findUser(UserApp user);

    Optional<UserApp> findUserById(long id);

    Collection<UserApp> findAll();

    UserApp findUserByEmail(String email);

    void deleteUserById(long id);

    void deleteByUser(UserApp user);


}
