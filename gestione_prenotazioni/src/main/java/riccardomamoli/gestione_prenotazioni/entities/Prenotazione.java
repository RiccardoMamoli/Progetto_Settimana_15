package riccardomamoli.gestione_prenotazioni.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazione")
public class Prenotazione {

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;
}
