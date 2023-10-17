package fr.studi.menuiserie.ws;

import fr.studi.menuiserie.pojo.Avis;
import fr.studi.menuiserie.service.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiRegistration.REST_AVIS)
@CrossOrigin
public class AvisWs {

    @Autowired
    private AvisService avisService;

    @GetMapping("/{id}")
    public Avis getAvisById(@PathVariable("id") Long id){
        return this.avisService.getAvisById(id);
    }

    @PutMapping("/{id}")
    public void updateAvis(@RequestBody Avis newAvis, @PathVariable("id") Long id){
        this.avisService.updateAvis(newAvis,id);
    }


}