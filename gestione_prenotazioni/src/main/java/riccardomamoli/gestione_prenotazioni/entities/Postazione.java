package riccardomamoli.gestione_prenotazioni.entities;

import jakarta.persistence.*;
import riccardomamoli.gestione_prenotazioni.enums.TipologiaPostazione;

import java.util.List;

@Entity
@Table(name = "postazione")
public class Postazione {

    @Column(name = "id_postazione")
    @Id
    @GeneratedValue
    private long id_postazione;

    @ManyToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;

    @Column(name = "codice_univoco", unique = true)
    private String codice_univoco;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "tipo_postazione")
    @Enumerated(EnumType.STRING)
    private TipologiaPostazione tipo_postazione;

    @Column(name = "max_partecipanti")
    private int max_partecipanti;

    public Postazione(){}

    public Postazione(Edificio edificio, List<Prenotazione> prenotazioni, String codice_univoco, String descrizione, TipologiaPostazione tipo_postazione, int max_partecipanti) {
        this.edificio = edificio;
        this.prenotazioni = prenotazioni;
        this.codice_univoco = codice_univoco;
        this.descrizione = descrizione;
        this.tipo_postazione = tipo_postazione;
        this.max_partecipanti = max_partecipanti;
    }

    public long getId_postazione() {
        return id_postazione;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public String getCodice_univoco() {
        return codice_univoco;
    }

    public void setCodice_univoco(String codice_univoco) {
        this.codice_univoco = codice_univoco;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipologiaPostazione getTipo_postazione() {
        return tipo_postazione;
    }

    public void setTipo_postazione(TipologiaPostazione tipo_postazione) {
        this.tipo_postazione = tipo_postazione;
    }

    public int getMax_partecipanti() {
        return max_partecipanti;
    }

    public void setMax_partecipanti(int max_partecipanti) {
        this.max_partecipanti = max_partecipanti;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "id_postazione=" + id_postazione +
                ", edificio=" + edificio +
                ", prenotazioni=" + prenotazioni +
                ", codice_univoco='" + codice_univoco + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", tipo_postazione=" + tipo_postazione +
                ", max_partecipanti=" + max_partecipanti +
                '}';
    }
}
