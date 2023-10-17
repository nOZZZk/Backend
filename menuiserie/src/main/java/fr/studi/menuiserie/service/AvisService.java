package fr.studi.menuiserie.service;

import fr.studi.menuiserie.pojo.Avis;
import fr.studi.menuiserie.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvisService {

    @Autowired
    private AvisRepository avisRepository;


    public void updateAvis(Avis newAvis, Long id) {
        Avis oldAvis = this.getAvisById(id);
        if(oldAvis != null){
            oldAvis.setIs_archived(newAvis.getIs_archived());
            oldAvis.setIs_approved(newAvis.getIs_approved());
            this.avisRepository.save(oldAvis);
        }
    }

    public Avis getAvisById(Long id) {
        Optional<Avis> avis = this.avisRepository.findById(id);
        return avis.isPresent() ? avis.get() : null;
    }
}