package fr.studi.menuiserie.ws;

import fr.studi.menuiserie.pojo.Menuiserie;
import fr.studi.menuiserie.service.MenuiserieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(ApiRegistration.REST_MENUISERIE)
@CrossOrigin
public class MenuiserieWs {

    @Autowired
    private MenuiserieService menuiserieService;

    @PostMapping
    public void createMenuiserie(@RequestBody Menuiserie menuiserie){
        this.menuiserieService.createMenuiserie(menuiserie);
    }

    @GetMapping
    public Menuiserie getMenuiserie(){
        return this.menuiserieService.getMenuiserie();
    }

    @PutMapping
    public void updateMenuiserie(@RequestBody Menuiserie menuiserie){
        this.menuiserieService.updateMenuiserie(menuiserie);
    }
}
