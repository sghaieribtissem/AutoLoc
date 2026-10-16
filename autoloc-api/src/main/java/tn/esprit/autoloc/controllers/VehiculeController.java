package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @PostMapping
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouter(vehicule);
    }

    @PutMapping("/{id}")
    public Vehicule modifierVehicule(@PathVariable Long id,
                                     @RequestBody Vehicule vehicule) {
        return vehiculeService.modifier(id, vehicule);
    }

    @GetMapping
    public List<Vehicule> getAll() {
        return vehiculeService.recupererTous();
    }

    @GetMapping("/getById/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.recupererParId(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.supprimer(id);
    }
}