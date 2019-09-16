package com.spring.soutenance.Service;

import com.spring.soutenance.DAO.RoleRepository;
import com.spring.soutenance.DAO.UserRepository;
import com.spring.soutenance.DTO.UserDto;
import com.spring.soutenance.domain.Enseignant;
import com.spring.soutenance.domain.Etudiant;
import com.spring.soutenance.domain.Role;
import com.spring.soutenance.domain.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

   @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
<<<<<<< HEAD
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb

    private static  String ETUDIANT ="Etudiant";

    @Override
    public UserApp saveUser(UserDto userDto) {
<<<<<<< HEAD
        UserApp  user=userRepository.findByEmail(userDto.getEmail()).get();
        if(user!=null) throw new RuntimeException("User already exists");

        if (userDto.getRole().equals(ETUDIANT)){
            Etudiant etudiant = new Etudiant();
            etudiant.setEmail(userDto.getEmail());
            etudiant.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
            etudiant.setNiveau(userDto.getNiveau());
            etudiant.setSpecialite(userDto.getSpecialite());
            Role role=roleRepository.findByRole(userDto.getRole()).get();
            etudiant.getUserRoles().add(role);

=======

        if (userDto.getRole().equals(ETUDIANT)){
            Etudiant etudiant = new Etudiant();
            etudiant.setFirstName(userDto.getFirstName());
            etudiant.setLastName(userDto.getLastName());
            etudiant.setEmail(userDto.getEmail());
            Role role=roleRepository.findByNomRole(userDto.getRole());
            etudiant.getUserRoles().add(role);
            userRepository.save(etudiant);
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
            return userRepository.save(etudiant);
        }
        else{
            Enseignant enseignant = new Enseignant();
<<<<<<< HEAD
            enseignant.setEmail(userDto.getEmail());
            System.err.println(userDto.getRole());
            enseignant.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
            Role role=roleRepository.findByRole(userDto.getRole()).get();
            enseignant.getUserRoles().add(role);

=======
            enseignant.setFirstName(userDto.getFirstName());
            enseignant.setLastName(userDto.getLastName());
            enseignant.setEmail(userDto.getEmail());
            Role role=roleRepository.findByNomRole(userDto.getRole());
            enseignant.getUserRoles().add(role);
            userRepository.save(enseignant);
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
            return userRepository.save(enseignant);
        }



    }

<<<<<<< HEAD


=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
    @Override
    public UserApp updateUser(UserDto userDto,long id) {
        UserApp user= userRepository.findById(id).get();
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPhone(userDto.getPhone());
<<<<<<< HEAD
        user.setUsername(userDto.getUserName());
=======
        user.setUserName(userDto.getUserName());
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(UserApp user) {
         userRepository.delete(user);
    }

    @Override
    public Optional<UserApp> findUser(UserApp user) {

<<<<<<< HEAD
        return userRepository.findById(user.getId());
=======
        return userRepository.findById(user.getUserId());
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
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
<<<<<<< HEAD
        return userRepository.findByEmail(email).get();
=======
        return userRepository.findByEmail(email);
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);

    }

    @Override
    public void deleteByUser(UserApp user) {
        userRepository.delete(user);

    }

<<<<<<< HEAD


=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
}
