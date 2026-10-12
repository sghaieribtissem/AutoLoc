package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Equipement;

import java.util.List;

public interface IEquipementService {

    Equipement ajouter(Equipement equipement);

    Equipement modifier(Long id, Equipement equipement);

    List<Equipement> recupererTous();

    Equipement recupererParId(Long id);

    void supprimer(Long id);
}