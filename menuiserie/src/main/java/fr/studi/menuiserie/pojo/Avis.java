package fr.studi.menuiserie.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Avis {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avis_id")
    private Long avis_id;

    private String pseudo;

    private Boolean is_approved;

    private Boolean is_archived;

    private String description;

    private String note;


}
