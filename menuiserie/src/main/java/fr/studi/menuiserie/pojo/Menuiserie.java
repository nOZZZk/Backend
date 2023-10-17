package fr.studi.menuiserie.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Menuiserie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuiserie_id;

    private String nom;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "menuiserie_id")
    private Set<Horaire> horaires = new LinkedHashSet<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "menuiserie_id")
    private Set<Avis> avis = new LinkedHashSet<>();

}
