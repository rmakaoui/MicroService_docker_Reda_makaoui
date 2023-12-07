package org.ensaj.voiture.Repository;

import org.ensaj.voiture.Model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
