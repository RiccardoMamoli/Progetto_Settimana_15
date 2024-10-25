package riccardomamoli.gestione_prenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import riccardomamoli.gestione_prenotazioni.entities.Utente;
import riccardomamoli.gestione_prenotazioni.services.PrenotazioneService;


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
    }
}
