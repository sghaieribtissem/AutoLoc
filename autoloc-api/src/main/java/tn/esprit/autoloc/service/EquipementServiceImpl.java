package tn.esprit.autoloc.service;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.IEquipementRepository;

import java.util.List;
@Service
public class EquipementServiceImpl implements IEquipementService {

    private final IEquipementRepository equipementRepository;

    public EquipementServiceImpl(IEquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
    }

    @Override
    public Equipement ajouter(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement modifier(Long id, Equipement equipement) {
        equipement.setIdEquipement(id);
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> recupererTous() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement recupererParId(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimer(Long id) {
        equipementRepository.deleteById(id);
    }
}