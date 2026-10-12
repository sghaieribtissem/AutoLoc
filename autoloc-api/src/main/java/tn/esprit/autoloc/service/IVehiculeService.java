package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule ajouter(Vehicule vehicule);

    Vehicule modifier(Long id, Vehicule vehicule);

    List<Vehicule> recupererTous();

    Vehicule recupererParId(Long id);

    void supprimer(Long id);
}