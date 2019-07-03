

package com.spring.soutenance.Controller;

import com.spring.soutenance.Service.SoutenanceService;
import com.spring.soutenance.domain.Soutenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/soutenance")
public class SoutenanceController {
    @Autowired
    SoutenanceService soutenanceService;

    //@GetMapping()
    @RequestMapping("/all")
    public Collection<Soutenance> findAll(){
        return soutenanceService.findAll();
    }
    @RequestMapping("/{id}")
    public Optional<Soutenance> findById(@PathVariable long id){
        return soutenanceService.findSoutenancetById(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/addsoutenance")
    public void addSoutenance(@RequestBody Soutenance soutenance){soutenanceService.saveSoutenance(soutenance);}

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void apdateSoutenance(@RequestBody Soutenance soutenance,@PathVariable long id){
        Soutenance s = findById(id).get();
        s.setJurys(soutenance.getJurys());
        s.setProjetSoutenanace(soutenance.getProjetSoutenanace());
        s.setSalle(soutenance.getSalle());
        soutenanceService.updateSoutenance(s);}

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteSoutenance(@PathVariable long id){soutenanceService.deleteSoutenanceById(id);};



}
