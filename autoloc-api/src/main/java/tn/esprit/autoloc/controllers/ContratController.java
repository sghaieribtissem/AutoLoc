package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("contrat")
public class ContratController {
    private final IContratService contratService;
    @PostMapping
    public Contrat ajouterContrat(@RequestBody Contrat contrat){
        return contratService.ajouter(contrat);
    }
    @PutMapping
    public Contrat modifierContrat(@RequestBody Contrat contrat){
        return contratService.modifier(contrat);
    }
    @GetMapping
    public List<Contrat>getAll(){ return contratService.recupererTous(); }
    @GetMapping("/getById/{idContrat}")
    public Contrat getContratById(@PathVariable Long idContrat){ return contratService.recupererParId((idContrat));}
    @DeleteMapping("/deleteById/{idContrat}")
    public void deleteById(@PathVariable("idContrat") Long idContrat) { contratService.supprimer(idContrat); }
}
