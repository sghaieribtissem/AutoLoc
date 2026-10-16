package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService;

    @PostMapping
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouter(client);
    }

    @PutMapping("/{id}")
    public Client modifierClient(@PathVariable Long id,
                                 @RequestBody Client client) {
        return clientService.modifier(id, client);
    }

    @GetMapping
    public List<Client> getAll() {
        return clientService.recupererTous();
    }

    @GetMapping("/getById/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.recupererParId(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.supprimer(id);
    }
}