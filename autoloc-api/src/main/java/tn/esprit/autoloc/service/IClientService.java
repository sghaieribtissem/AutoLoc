package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;

import java.util.List;

public interface IClientService {

    Client ajouter(Client client);

    Client modifier(Long id, Client client);

    List<Client> recupererTous();

    Client recupererParId(Long id);

    void supprimer(Long id);
}