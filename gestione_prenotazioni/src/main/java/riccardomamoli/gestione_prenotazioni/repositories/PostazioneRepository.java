package riccardomamoli.gestione_prenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import riccardomamoli.gestione_prenotazioni.entities.Postazione;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

}
