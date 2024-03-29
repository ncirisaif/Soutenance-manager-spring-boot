package com.spring.soutenance.Service;

import com.spring.soutenance.DAO.UserRepository;
import com.spring.soutenance.domain.UserApp;
import com.spring.soutenance.springsocial.exception.ResourceNotFoundException;
import com.spring.soutenance.springsocial.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;



    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        UserApp user = userRepository.findByEmail(email).get();
        if(user==null) throw new UsernameNotFoundException("User not found with email : " + email);
        return UserPrincipal.create(user);
    }

    @Transactional
    public UserDetails loadUserById(Long id) {
        UserApp user = userRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("User", "id", id)
        );

        return UserPrincipal.create(user);
    }





    /* @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserApp user=userRepository.findByEmail(username);
        if(user==null) throw new UsernameNotFoundException("invalid user");
        Collection<GrantedAuthority> authorities=new ArrayList<>();
        user.getUserRoles().forEach(r->{
            authorities.add(new SimpleGrantedAuthority("ROLE_" + r.getRole()));
        });


        return  new User(user.getEmail(),user.getPassword(),true,true,true,true,authorities);
    }*/
    }

