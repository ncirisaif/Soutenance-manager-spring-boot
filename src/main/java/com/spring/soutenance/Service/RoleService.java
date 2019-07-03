package com.spring.soutenance.Service;

import com.spring.soutenance.domain.Role;

import java.util.Collection;
import java.util.Optional;

public interface RoleService {
    Role saveRole(Role role);

    Role updateRole(Role role);

    void deleteRole(Role role);

    Optional<Role> findRole(Role role);

    Optional<Role> findRoletById(long id);

    Collection<Role> findAll();

    void deleteRoleById(long id);
}
