package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation ajouter(Reservation reservation);

    Reservation modifier(Long id, Reservation reservation);

    List<Reservation> recupererTous();

    Reservation recupererParId(Long id);

    void supprimer(Long id);
}