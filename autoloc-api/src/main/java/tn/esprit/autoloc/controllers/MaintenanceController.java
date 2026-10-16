package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @PostMapping
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajouter(maintenance);
    }

    @PutMapping("/{id}")
    public Maintenance modifierMaintenance(@PathVariable Long id,
                                           @RequestBody Maintenance maintenance) {
        return maintenanceService.modifier(id, maintenance);
    }

    @GetMapping
    public List<Maintenance> getAll() {
        return maintenanceService.recupererTous();
    }

    @GetMapping("/getById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.recupererParId(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.supprimer(id);
    }
}