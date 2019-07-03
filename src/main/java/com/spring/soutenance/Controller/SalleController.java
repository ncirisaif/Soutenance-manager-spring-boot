

package com.spring.soutenance.Controller;

import com.spring.soutenance.Service.SalleService;
import com.spring.soutenance.domain.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/salles")
public class SalleController {
    @Autowired
    SalleService salleService;

    //@GetMapping()
    @RequestMapping("/all")
    public Collection<Salle> findAll(){
        return salleService.findAll();
    }
    @RequestMapping("/{id}")
    public Optional<Salle> findById(@PathVariable long id){
        return salleService.findSalletById(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/addsalle")
    public void addSalle(@RequestBody Salle salle){salleService.saveSalle(salle);}

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void apdateSalle(@RequestBody Salle salle,@PathVariable long id){
        Salle s = findById(id).get();
        s.setSoutenances(s.getSoutenances());;
        salleService.updateSalle(s);}

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteSalle(@PathVariable long id){salleService.deleteSalleById(id);};
}
