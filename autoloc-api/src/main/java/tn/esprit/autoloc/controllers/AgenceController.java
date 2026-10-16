package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouter(agence);
    }

    @PutMapping("/{id}")
    public Agence modifierAgence(@PathVariable Long id,
                                 @RequestBody Agence agence) {
        return agenceService.modifier(id, agence);
    }

    @GetMapping
    public List<Agence> getAll() {
        return agenceService.recupererTous();
    }

    @GetMapping("/getById/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceService.recupererParId(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.supprimer(id);
    }
}