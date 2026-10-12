package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.IContratRepository;

import java.util.List;

@Service
public class ContratServiceImpl implements IContratService {

    private final IContratRepository contratRepository;

    public ContratServiceImpl(IContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public Contrat ajouter(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat modifier(Long id, Contrat contrat) {
        contrat.setIdContrat(id);
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> recupererTous() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat recupererParId(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimer(Long id) {
        contratRepository.deleteById(id);
    }
}