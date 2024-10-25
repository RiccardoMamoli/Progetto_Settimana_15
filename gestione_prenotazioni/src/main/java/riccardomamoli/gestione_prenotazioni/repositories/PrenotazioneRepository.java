package riccardomamoli.gestione_prenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import riccardomamoli.gestione_prenotazioni.entities.Postazione;
import riccardomamoli.gestione_prenotazioni.entities.Prenotazione;


import java.time.LocalDate;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    boolean existsByIdUtenteAndDataPrenotazione(Long id, LocalDate dataPrenotazione);
    boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);

}
