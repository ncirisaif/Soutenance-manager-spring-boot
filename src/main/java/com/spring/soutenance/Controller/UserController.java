package com.spring.soutenance.Controller;

import com.spring.soutenance.DTO.UserDto;
import com.spring.soutenance.Service.UserService;
import com.spring.soutenance.domain.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    // Ajouter un utilisateur

    @PostMapping("/adduser")
    public void addUser(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
      }

    // modifier un utilisateur

    @PutMapping( value = "/{id}")
    public void apdateUser(@RequestBody UserDto userDto,@PathVariable long id){
        userService.updateUser(userDto,id);}

    // supprimer un utilisateur

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteUser(@PathVariable long id){userService.deleteUserById(id);}

    //@GetMapping()
    @RequestMapping("/all")
    public Collection<UserApp> findAll(){
        return userService.findAll();
    }
    @RequestMapping("/{id}")
    public Optional<UserApp> findById(@PathVariable long id){
        return userService.findUserById(id);
    }

}
