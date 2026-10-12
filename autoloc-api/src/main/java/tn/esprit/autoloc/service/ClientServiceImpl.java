package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.IClientRepository;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    private final IClientRepository clientRepository;

    public ClientServiceImpl(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client ajouter(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifier(Long id, Client client) {
        client.setIdClient(id);
        return clientRepository.save(client);
    }

    @Override
    public List<Client> recupererTous() {
        return clientRepository.findAll();
    }

    @Override
    public Client recupererParId(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimer(Long id) {
        clientRepository.deleteById(id);
    }
}