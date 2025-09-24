package com.example.hotel.controller;

import com.example.hotel.model.Chambre;
import com.example.hotel.service.ChambreService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/chambres")
public class ChambreController {
    private final ChambreService chambreService;
    public ChambreController(ChambreService chambreService) {
        this.chambreService = chambreService;
    }
    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }
    @PostMapping
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }
    @DeleteMapping("/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
    }
}