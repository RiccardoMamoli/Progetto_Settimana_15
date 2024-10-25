package riccardomamoli.gestione_prenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import riccardomamoli.gestione_prenotazioni.entities.Edificio;
import riccardomamoli.gestione_prenotazioni.entities.Prenotazione;
import riccardomamoli.gestione_prenotazioni.entities.Utente;
import riccardomamoli.gestione_prenotazioni.repositories.EdificioRepository;
import riccardomamoli.gestione_prenotazioni.repositories.PostazioneRepository;
import riccardomamoli.gestione_prenotazioni.repositories.PrenotazioneRepository;
import riccardomamoli.gestione_prenotazioni.repositories.UtenteRepository;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private PostazioneRepository postazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private EdificioRepository edificioRepository;

    // CREAZIONE UTENTE

   public Utente creaUtente(Utente utente){
       return utenteRepository.save(utente);
   }

   // CREAZIONE PRENOTAZIONE

    public Prenotazione creaPrenotazione(Prenotazione prenotazione) {
       return prenotazioneRepository.save(prenotazione);
    }

    // CREAZIONE EDIFICIO

    public Edificio creaEdificio(Edificio edificio){
       return edificioRepository.save(edificio);
    }

}
