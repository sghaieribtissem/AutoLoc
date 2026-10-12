package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.IEmployeRepository;

import java.util.List;

@Service
public class EmployeServiceImpl implements IEmployeService {

    private final IEmployeRepository employeRepository;

    public EmployeServiceImpl(IEmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public Employe ajouter(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifier(Long id, Employe employe) {
        employe.setIdEmploye(id);
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> recupererTous() {
        return employeRepository.findAll();
    }

    @Override
    public Employe recupererParId(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimer(Long id) {
        employeRepository.deleteById(id);
    }
}