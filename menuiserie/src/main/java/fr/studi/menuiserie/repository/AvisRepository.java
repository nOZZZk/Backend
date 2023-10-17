package fr.studi.menuiserie.repository;

import fr.studi.menuiserie.pojo.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisRepository extends JpaRepository<Avis,Long> {
}