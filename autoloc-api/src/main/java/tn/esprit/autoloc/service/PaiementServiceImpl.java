package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.IPaiementRepository;

import java.util.List;

@Service
public class PaiementServiceImpl implements IPaiementService {

    private final IPaiementRepository paiementRepository;

    public PaiementServiceImpl(IPaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @Override
    public Paiement ajouter(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement modifier(Long id, Paiement paiement) {
        paiement.setIdPaiement(id);
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> recupererTous() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement recupererParId(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimer(Long id) {
        paiementRepository.deleteById(id);
    }
}