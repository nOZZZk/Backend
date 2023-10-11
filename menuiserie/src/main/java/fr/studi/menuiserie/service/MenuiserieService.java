package fr.studi.menuiserie.service;

import fr.studi.menuiserie.pojo.Menuiserie;
import fr.studi.menuiserie.repository.MenuiseriereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuiserieService {

    @Autowired
    private MenuiseriereRepository menuiseriereRepository;


    public void createMenuiserie(Menuiserie menuiserie){
        this.menuiseriereRepository.save(menuiserie);

    }
}
