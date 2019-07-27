package com.spring.soutenance.Service;

import com.spring.soutenance.DAO.RoleRepository;
import com.spring.soutenance.DAO.UserRepository;
import com.spring.soutenance.DTO.UserDtoRegistration;
import com.spring.soutenance.domain.Role;
import com.spring.soutenance.domain.UserApp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.codec.Base64;

import java.io.IOException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountServiceImpl implements AccountService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserApp saveUser(UserDtoRegistration userDtoRegistration) {
        UserApp  user=userRepository.findByEmail(userDtoRegistration.getEmail());
        if(user!=null) throw new RuntimeException("User already exists");
        //if(!password.equals(confirmedPassword)) throw new RuntimeException("Please confirm your password");
        UserApp userApp=new UserApp();
        userApp.setFirstName(userDtoRegistration.getFirstName());
        userApp.setPassword(bCryptPasswordEncoder.encode(userDtoRegistration.getPassword()));
        userRepository.save(userApp);
      //  addRoleToUser(username,"USER");
        return userApp;    }

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public UserApp loadUserByUsername(String username) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String role) {

    }


}
