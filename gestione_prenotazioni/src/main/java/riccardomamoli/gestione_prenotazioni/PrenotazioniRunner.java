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

import java.time.LocalDate;
import java.util.Optional;


@Component
public class PrenotazioniRunner implements CommandLineRunner {
    @Autowired
    PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {


/*
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

 */


        Edificio edificioTrovato1 = prenotazioneService.trovaEdificio(Long.valueOf(1));
        Edificio edificioTrovato2 = prenotazioneService.trovaEdificio(Long.valueOf(2));
        Edificio edificioTrovato3 = prenotazioneService.trovaEdificio(Long.valueOf(3));

        Utente utenteTrovato1 = prenotazioneService.trovaUtente(Long.valueOf(1));
        Utente utenteTrovato2 = prenotazioneService.trovaUtente(Long.valueOf(2));
        Utente utenteTrovato3 = prenotazioneService.trovaUtente(Long.valueOf(3));

        Postazione postazioneTrovata1 = prenotazioneService.trovaPostazione(Long.valueOf(1));
        Postazione postazioneTrovata2 = prenotazioneService.trovaPostazione(Long.valueOf(2));
        Postazione postazioneTrovata3 = prenotazioneService.trovaPostazione(Long.valueOf(52));


/*
        Postazione postazione1 = new Postazione(edificioTrovato1.get(), "12345", "Postazione molto carina", TipologiaPostazione.PRIVATO, 10);
        Postazione postazione2 = new Postazione(edificioTrovato2.get(), "75439", "Altra postazione carina", TipologiaPostazione.OPENSPACE,20);
        Postazione postazione3 = new Postazione(edificioTrovato3, "93483","Molta carina anche questa", TipologiaPostazione.SALA_RIUNIONI, 5);
        prenotazioneService.creaPostazione(postazione3);
        System.out.println(" ");
        System.out.println("Hai creato una nuova postazione: ");
        System.out.println(" ");
        System.out.println("ID: " + postazione3.getIdPostazione());
        System.out.println("Presso l'edificio: " + postazione3.getEdificio().getNomeEdificio());
        System.out.println("Tipologia: " + postazione3.getTipoPostazione());
        System.out.println("Numero massimo partecipanti: " + postazione3.getMaxPartecipanti());
        System.out.println(" ");

 */


        Prenotazione prenotazione1 = new Prenotazione(utenteTrovato1, postazioneTrovata1, LocalDate.of(2024 , 10, 1));
        Prenotazione prenotazione2 = new Prenotazione(utenteTrovato2, postazioneTrovata2, LocalDate.of(2024, 9,10));
        Prenotazione prenotazione3 = new Prenotazione(utenteTrovato3, postazioneTrovata3, LocalDate.of(2024, 10, 12));
        prenotazioneService.creaPrenotazione(prenotazione1);
        prenotazioneService.creaPrenotazione(prenotazione2);
        prenotazioneService.creaPrenotazione(prenotazione3);


    }
}
