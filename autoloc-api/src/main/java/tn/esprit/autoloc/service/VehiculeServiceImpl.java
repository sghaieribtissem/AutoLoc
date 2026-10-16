package tn.esprit.autoloc.service;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.IVehiculeRepository;
import java.util.List;

@Service
public class VehiculeServiceImpl implements IVehiculeService {
    private final IVehiculeRepository vehiculeRepository;
    public VehiculeServiceImpl(IVehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }
    @Override
    public Vehicule ajouter(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
    @Override
    public Vehicule modifier(Long id, Vehicule vehicule) {
        vehicule.setIdVehicule(id);
        return vehiculeRepository.save(vehicule);
    }
    @Override
    public List<Vehicule> recupererTous() {
        return vehiculeRepository.findAll();
    }
    @Override
    public Vehicule recupererParId(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }
    @Override
    public void supprimer(Long id) {
        vehiculeRepository.deleteById(id);
    }
}