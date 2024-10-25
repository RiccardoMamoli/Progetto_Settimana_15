package riccardomamoli.gestione_prenotazioni.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazione")
public class Prenotazione {

    @Id
    @GeneratedValue
    private long id_prenotazione;

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "id_postazione")
    private Postazione postazione;

    @Column(name = "data_prenotazione")
    private LocalDate data_prenotazione;

    public Prenotazione(){};

    public Prenotazione(Utente utente, Postazione postazione, LocalDate data_prenotazione) {
        this.utente = utente;
        this.postazione = postazione;
        this.data_prenotazione = data_prenotazione;
    }

    public long getId_prenotazione() {
        return id_prenotazione;
    }


    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Postazione getPostazione() {
        return postazione;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    public LocalDate getData_prenotazione() {
        return data_prenotazione;
    }

    public void setData_prenotazione(LocalDate data_prenotazione) {
        this.data_prenotazione = data_prenotazione;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id_prenotazione=" + id_prenotazione +
                ", utente=" + utente +
                ", postazione=" + postazione +
                ", data_prenotazione=" + data_prenotazione +
                '}';
    }
}
