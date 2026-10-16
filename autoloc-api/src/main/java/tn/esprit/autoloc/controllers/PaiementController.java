package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {

    private final IPaiementService paiementService;

    @PostMapping
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.ajouter(paiement);
    }

    @PutMapping("/{id}")
    public Paiement modifierPaiement(@PathVariable Long id,
                                     @RequestBody Paiement paiement) {
        return paiementService.modifier(id, paiement);
    }

    @GetMapping
    public List<Paiement> getAll() {
        return paiementService.recupererTous();
    }

    @GetMapping("/getById/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return paiementService.recupererParId(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.supprimer(id);
    }
}