package com.spring.soutenance.Service;

import com.spring.soutenance.DAO.RoleRepository;
import com.spring.soutenance.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(Role role) {
        roleRepository.delete(role);
    }

    @Override
    public Optional<Role> findRole(Role role) {
        return roleRepository.findById(role.getRoleId());
    }

    @Override
    public Optional<Role> findRoletById(long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Collection<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public void deleteRoleById(long id) {
        roleRepository.deleteById(id);
    }
<<<<<<< HEAD

    @Override
    public Optional<Role> findByName(String name) {
        return roleRepository.findByRole(name);
    }
=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
}
