package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Paiement;

import java.util.List;

public interface IPaiementService {

    Paiement ajouter(Paiement paiement);

    Paiement modifier(Long id, Paiement paiement);

    List<Paiement> recupererTous();

    Paiement recupererParId(Long id);

    void supprimer(Long id);
}