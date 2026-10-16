package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {

    private final IEquipementService equipementService;

    @PostMapping
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouter(equipement);
    }

    @PutMapping("/{id}")
    public Equipement modifierEquipement(@PathVariable Long id,
                                         @RequestBody Equipement equipement) {
        return equipementService.modifier(id, equipement);
    }

    @GetMapping
    public List<Equipement> getAll() {
        return equipementService.recupererTous();
    }

    @GetMapping("/getById/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementService.recupererParId(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.supprimer(id);
    }
}