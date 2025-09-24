package com.example.hotel.controller;

import com.example.hotel.model.Chambre;
import com.example.hotel.service.ChambreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final ChambreService chambreService;

    public HomeController(ChambreService chambreService) {
        this.chambreService = chambreService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("hotelName", "Hôtel Paradisiaque");
        model.addAttribute("description", "Bienvenue dans le projet de gestion hôtelière réalisé avec Java Spring Boot.");
        
        // Ajouter les chambres pour les cartes interactives
        List<Chambre> chambres = chambreService.getAllChambres();
        model.addAttribute("chambres", chambres);

        // Fonctions disponibles
        String[] features = {
            "Gestion des chambres (CRUD)",
            "Réservations des clients",
            "Gestion des clients et employés",
            "Feedback et évaluation",
            "Système de fidélité",
            "Événements et installations"
        };
        model.addAttribute("features", features);

        return "index";
    }
}
