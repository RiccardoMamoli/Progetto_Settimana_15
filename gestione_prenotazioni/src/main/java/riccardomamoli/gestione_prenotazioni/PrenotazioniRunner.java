package riccardomamoli.gestione_prenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import riccardomamoli.gestione_prenotazioni.entities.Edificio;
import riccardomamoli.gestione_prenotazioni.entities.Postazione;
import riccardomamoli.gestione_prenotazioni.entities.Prenotazione;
import riccardomamoli.gestione_prenotazioni.entities.Utente;
import riccardomamoli.gestione_prenotazioni.enums.TipologiaPostazione;
import riccardomamoli.gestione_prenotazioni.services.PrenotazioneService;

import java.util.Optional;


@Component
public class PrenotazioniRunner implements CommandLineRunner {
    @Autowired
    PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {



        Utente utente1 = new Utente("riccardoM", "Riccardo Mamoli", "ric@gmail.com");
        Utente utente2 = new Utente("marcoP", "Marco Panarelli", "marco1@gmail.com");
        Utente utente3 = new Utente("francescoR", "Francesco Rizzoli", "franc@gmail.com");
        prenotazioneService.creaUtente(utente1);
        prenotazioneService.creaUtente(utente2);
        prenotazioneService.creaUtente(utente3);


        Edificio edificio1 = new Edificio("Edificio Rosso", "Via Rossi 16" , "Reggio Emilia");
        Edificio edificio2 = new Edificio("Edifcio Blu", "Via Blu 43", "Milano");
        Edificio edificio3 = new Edificio("Edifcio Verde", "Via Verdi 2", "Parma");
        prenotazioneService.creaEdificio(edificio1);
        prenotazioneService.creaEdificio(edificio2);
        prenotazioneService.creaEdificio(edificio3);



        Edificio edificio4 = new Edificio("Edificio Rosso", "Via Rosse", "Reggio Emilia");
        prenotazioneService.creaEdificio(edificio4);
/*
        Optional<Edificio> edificioTrovato1 = prenotazioneService.trovaEdificio(Long.valueOf(1));
        Optional<Edificio> edificioTrovato2 = prenotazioneService.trovaEdificio(Long.valueOf(2));
        Optional<Edificio> edificioTrovato3 = prenotazioneService.trovaEdificio(Long.valueOf(3));

        if (edificioTrovato1.isPresent()) {
            // Postazione postazione1 = new Postazione(edificioTrovato1.get(), "12345", "Postazione molto carina", TipologiaPostazione.PRIVATO, 10);
            // Postazione postazione2 = new Postazione(edificioTrovato2.get(), "75439", "Altra postazione carina", TipologiaPostazione.OPENSPACE,20);
            // Postazione postazione3 = new Postazione(edificioTrovato3.get(), "93483","Molta carina anche questa", TipologiaPostazione.SALA_RIUNIONI, 5);
            //prenotazioneService.creaPostazione(postazione3);
            System.out.println(" ");
            System.out.println("Hai creato una nuova postazione: ");
            System.out.println(" ");
            // System.out.println("ID: " + postazione3.getId_postazione());
           // System.out.println("Presso l'edificio: " + postazione3.getEdificio().getNome_edificio());
           // System.out.println("Tipologia: " + postazione3.getTipo_postazione());
           // System.out.println("Numero massimo partecipanti: " + postazione3.getMax_partecipanti());
            System.out.println(" ");
        } else {
            System.out.println("Edificio non trovato.");
        }

          */


    }
}
