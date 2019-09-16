

package com.spring.soutenance.Controller;

import com.spring.soutenance.Service.RoleService;
import com.spring.soutenance.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    RoleService roleService;


    //@GetMapping()
    @RequestMapping("/all")
    public Collection<Role> findAll(){
        return roleService.findAll();
    }
    @RequestMapping("/{id}")
    public Optional<Role> findById(@PathVariable long id){
        return roleService.findRoletById(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/addrole")
    public void addRole(@RequestBody Role role){roleService.saveRole(role);}

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void apdateRole(@RequestBody Role role,@PathVariable long id){
        Role s = findById(id).get();
<<<<<<< HEAD
        s.setRole(s.getRole());
=======
        s.setNomRole(s.getNomRole());
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
        roleService.updateRole(s);}

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteRole(@PathVariable long id){roleService.deleteRoleById(id);}
}
