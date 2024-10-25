package riccardomamoli.gestione_prenotazioni.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "edificio")
public class Edificio {

    @Column(name = "id_edificio")
    @Id
    @GeneratedValue
    private long id_edificio;

    @Column(name = "nome_edificio")
    private String nome_edificio;

    @Column(name = "indirizzo_edificio")
    private String indirizzo_edificio;

    @Column(name = "citta_edificio")
    private String citta_edificio;

    public Edificio(){};

    public Edificio(String nome_edificio, String indirizzo_edificio, String citta_edificio) {
        this.nome_edificio = nome_edificio;
        this.indirizzo_edificio = indirizzo_edificio;
        this.citta_edificio = citta_edificio;
    }

    public long getId_edificio() {
        return id_edificio;
    }

    public String getNome_edificio() {
        return nome_edificio;
    }

    public void setNome_edificio(String nome_edificio) {
        this.nome_edificio = nome_edificio;
    }

    public String getIndirizzo_edificio() {
        return indirizzo_edificio;
    }

    public void setIndirizzo_edificio(String indirizzo_edificio) {
        this.indirizzo_edificio = indirizzo_edificio;
    }

    public String getCitta_edificio() {
        return citta_edificio;
    }

    public void setCitta_edificio(String citta_edificio) {
        this.citta_edificio = citta_edificio;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "id_edificio=" + id_edificio +
                ", nome_edificio='" + nome_edificio + '\'' +
                ", indirizzo_edificio='" + indirizzo_edificio + '\'' +
                ", citta_edificio='" + citta_edificio + '\'' +
                '}';
    }
}
