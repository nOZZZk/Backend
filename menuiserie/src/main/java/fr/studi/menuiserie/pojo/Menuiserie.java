package fr.studi.menuiserie.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Menuiserie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuiserie_id;

    private String nom;

}
