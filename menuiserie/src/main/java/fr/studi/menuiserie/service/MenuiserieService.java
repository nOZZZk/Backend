package fr.studi.menuiserie.service;

import fr.studi.menuiserie.pojo.Menuiserie;
import fr.studi.menuiserie.repository.MenuiseriereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuiserieService {

    @Autowired
    private MenuiseriereRepository menuiseriereRepository;


    public void createMenuiserie(Menuiserie menuiserie){
        this.menuiseriereRepository.save(menuiserie);
    }

    public Menuiserie getMenuiserie(){
        Menuiserie maMenuiserie = null;
        List<Menuiserie> menuiserieList = this.menuiseriereRepository.findAll();
        if(menuiserieList.isEmpty()){
            maMenuiserie = menuiserieList.get(0);
        }
        return maMenuiserie;
        }
    }

