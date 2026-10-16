package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private final IReservationService reservationService;

    @PostMapping
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouter(reservation);
    }

    @PutMapping("/{id}")
    public Reservation modifierReservation(@PathVariable Long id,
                                           @RequestBody Reservation reservation) {
        return reservationService.modifier(id, reservation);
    }

    @GetMapping
    public List<Reservation> getAll() {
        return reservationService.recupererTous();
    }

    @GetMapping("/getById/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationService.recupererParId(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.supprimer(id);
    }
}