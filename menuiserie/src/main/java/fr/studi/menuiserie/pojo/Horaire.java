package fr.studi.menuiserie.pojo;

import fr.studi.menuiserie.pojo.enumerate.Jour;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;


@Entity
@Setter
@Getter
public class Horaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long horaire_id;

    @Valid
    @Enumerated(value = EnumType.STRING)
    private Jour jour;

    private String heure_matin;
    private String heure_apres_midi;

}
