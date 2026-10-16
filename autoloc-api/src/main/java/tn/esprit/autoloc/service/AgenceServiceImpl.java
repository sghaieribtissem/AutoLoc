package tn.esprit.autoloc.service;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.IAgenceRepository;
import java.util.List;

@Service
public class AgenceServiceImpl implements IAgenceService {
    private final IAgenceRepository agenceRepository;
    public AgenceServiceImpl(IAgenceRepository agenceRepository) {
        this.agenceRepository = agenceRepository;
    }
    @Override
    public Agence ajouter(Agence agence) {
        return agenceRepository.save(agence);
    }
    @Override
    public Agence modifier(Long id, Agence agence) {
        agence.setIdAgence(id);
        return agenceRepository.save(agence);
    }
    @Override
    public List<Agence> recupererTous() {
        return agenceRepository.findAll();
    }
    @Override
    public Agence recupererParId(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }
    @Override
    public void supprimer(Long id) {
        agenceRepository.deleteById(id);
    }
}