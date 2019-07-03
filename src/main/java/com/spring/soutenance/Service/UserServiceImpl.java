package com.spring.soutenance.Service;

import com.spring.soutenance.DAO.RoleRepository;
import com.spring.soutenance.DAO.UserRepository;
import com.spring.soutenance.DTO.UserDto;
import com.spring.soutenance.domain.Enseignant;
import com.spring.soutenance.domain.Etudiant;
import com.spring.soutenance.domain.Role;
import com.spring.soutenance.domain.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

   @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    private static  String ETUDIANT ="Etudiant";

    @Override
    public UserApp saveUser(UserDto userDto) {

        if (userDto.getRole().equals(ETUDIANT)){
            Etudiant etudiant = new Etudiant();
            etudiant.setFirstName(userDto.getFirstName());
            etudiant.setLastName(userDto.getLastName());
            etudiant.setEmail(userDto.getEmail());
            Role role=roleRepository.findByNomRole(userDto.getRole());
            etudiant.getUserRoles().add(role);
            userRepository.save(etudiant);
            return userRepository.save(etudiant);
        }
        else{
            Enseignant enseignant = new Enseignant();
            enseignant.setFirstName(userDto.getFirstName());
            enseignant.setLastName(userDto.getLastName());
            enseignant.setEmail(userDto.getEmail());
            Role role=roleRepository.findByNomRole(userDto.getRole());
            enseignant.getUserRoles().add(role);
            userRepository.save(enseignant);
            return userRepository.save(enseignant);
        }



    }

    @Override
    public UserApp updateUser(UserDto userDto,long id) {
        UserApp user= userRepository.findById(id).get();
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPhone(userDto.getPhone());
        user.setUserName(userDto.getUserName());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(UserApp user) {
         userRepository.delete(user);
    }

    @Override
    public Optional<UserApp> findUser(UserApp user) {

        return userRepository.findById(user.getUserId());
    }

    @Override
    public Optional<UserApp> findUserById(long id) {


        return userRepository.findById(id);
    }

    @Override
    public Collection<UserApp> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserApp findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);

    }

    @Override
    public void deleteByUser(UserApp user) {
        userRepository.delete(user);

    }

}
