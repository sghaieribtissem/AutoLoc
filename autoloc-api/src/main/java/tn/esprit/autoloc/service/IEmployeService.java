package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employe;

import java.util.List;

public interface IEmployeService {

    Employe ajouter(Employe employe);

    Employe modifier(Long id, Employe employe);

    List<Employe> recupererTous();

    Employe recupererParId(Long id);

    void supprimer(Long id);
}