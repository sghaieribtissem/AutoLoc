package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance ajouter(Maintenance maintenance);

    Maintenance modifier(Long id, Maintenance maintenance);

    List<Maintenance> recupererTous();

    Maintenance recupererParId(Long id);

    void supprimer(Long id);
}