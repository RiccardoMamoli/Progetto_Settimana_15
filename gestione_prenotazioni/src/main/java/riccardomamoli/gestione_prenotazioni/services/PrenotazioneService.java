package riccardomamoli.gestione_prenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import riccardomamoli.gestione_prenotazioni.entities.Edificio;
import riccardomamoli.gestione_prenotazioni.entities.Postazione;
import riccardomamoli.gestione_prenotazioni.entities.Prenotazione;
import riccardomamoli.gestione_prenotazioni.entities.Utente;
import riccardomamoli.gestione_prenotazioni.exceptions.AlreadyPresentRecordException;
import riccardomamoli.gestione_prenotazioni.exceptions.SameIdException;
import riccardomamoli.gestione_prenotazioni.repositories.EdificioRepository;
import riccardomamoli.gestione_prenotazioni.repositories.PostazioneRepository;
import riccardomamoli.gestione_prenotazioni.repositories.PrenotazioneRepository;
import riccardomamoli.gestione_prenotazioni.repositories.UtenteRepository;

import java.util.Optional;

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

    // UTENTE

   public Utente creaUtente(Utente utente){
       return utenteRepository.save(utente);
   }

   public Optional<Utente> trovaUtente(Long id) {
       return utenteRepository.findById(id);
   }

   // POSTAZIONE

    public Postazione creaPostazione(Postazione postazione){
       return postazioneRepository.save(postazione);
    }

    public Optional<Postazione> trovaPostazione(Long id) {
        return postazioneRepository.findById(id);
    }



   // PRENOTAZIONE

    public Prenotazione creaPrenotazione(Prenotazione prenotazione) {
       if(prenotazioneRepository.existsByDataPrenotazione(prenotazione.getDataPrenotazione())){
           throw new SameIdException("Esiste già una prenotazione in questa giornata per la postazione numero " + prenotazione.getPostazione().getIdPostazione());

       }       return prenotazioneRepository.save(prenotazione);
    }

    public Optional<Prenotazione> trovaPrenotazione(Long id){
        return prenotazioneRepository.findById(id);
    }



    // EDIFICIO

    public Edificio creaEdificio(Edificio edificio){
       if(edificioRepository.existsByNomeEdificio(edificio.getNomeEdificio())) {
           throw new AlreadyPresentRecordException("Esiste gia un edificio con questo nome!");
       } else {
           return edificioRepository.save(edificio);
       }
    }

    public Optional<Edificio> trovaEdificio(Long id){
       return edificioRepository.findById(id);
    }

}
