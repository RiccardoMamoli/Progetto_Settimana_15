package riccardomamoli.gestione_prenotazioni.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "utente")

public class Utente {

    @Id
    @GeneratedValue
    private long id_utente;

    @Column(name = "username")
    private String username;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    public Utente(){};

    public Utente(String username, String nome, String email) {
        this.username = username;
        this.nome = nome;
        this.email = email;
    }

    public long getId_utente() {
        return id_utente;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id_utente=" + id_utente +
                ", username='" + username + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
