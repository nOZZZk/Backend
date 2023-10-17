package fr.studi.menuiserie.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Service {

    @Id
    @Column (name = "service_id")
    private Long service_id;

    private String nom;

    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "service_id")
    private Set<Image> images = new LinkedHashSet<>();

}
