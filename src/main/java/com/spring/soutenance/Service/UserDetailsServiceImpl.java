package com.spring.soutenance.Service;

import com.spring.soutenance.DAO.UserRepository;
import com.spring.soutenance.domain.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserApp user=userRepository.findByEmail(username);
        if(user==null) throw new UsernameNotFoundException("invalid user");
        Collection<GrantedAuthority> authorities=new ArrayList<>();
        user.getUserRoles().forEach(r->{
            authorities.add(new SimpleGrantedAuthority("ROLE_" + r.getRole()));
        });


        return  new User(user.getEmail(),user.getPassword(),true,true,true,true,authorities);
    }


    }

