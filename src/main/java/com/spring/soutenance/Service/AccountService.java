package com.spring.soutenance.Service;

import com.spring.soutenance.DTO.UserDtoRegistration;
import com.spring.soutenance.domain.Role;
import com.spring.soutenance.domain.UserApp;

public interface AccountService {
    public UserApp saveUser(UserDtoRegistration userDtoRegistration);
    public Role save(Role role);
    public UserApp loadUserByUsername(String username);
    public void addRoleToUser(String username,String role);
}
