
package com.spring.soutenance.Controller;

import com.spring.soutenance.Service.ProjetService;
import com.spring.soutenance.domain.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/projets")
public class ProjetController {
    @Autowired
    ProjetService projetService;

    //@GetMapping()
    @RequestMapping("/all")
    public Collection<Projet> findAll(){
        return projetService.findAll();
    }
    @RequestMapping("/{id}")
    public Optional<Projet> findById(@PathVariable long id){
        return projetService.findProjetById(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/addrole")
    public void addProjet(@RequestBody Projet projet){projetService.saveProjet(projet);}

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void apdateProjet(@RequestBody Projet projet,@PathVariable long id){
        Projet s = findById(id).get();
        s.setEnseignant(projet.getEnseignant());
        s.setEtudiants(projet.getEtudiants());
        s.setName(projet.getName());
        projetService.updateProjet(s);}

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteProjet(@PathVariable long id){projetService.deleteProjetById(id);}
}
