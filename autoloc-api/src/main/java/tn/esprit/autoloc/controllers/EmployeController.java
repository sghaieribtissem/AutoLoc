package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouter(employe);
    }

    @PutMapping("/{id}")
    public Employe modifierEmploye(@PathVariable Long id,
                                   @RequestBody Employe employe) {
        return employeService.modifier(id, employe);
    }

    @GetMapping
    public List<Employe> getAll() {
        return employeService.recupererTous();
    }

    @GetMapping("/getById/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeService.recupererParId(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.supprimer(id);
    }
}