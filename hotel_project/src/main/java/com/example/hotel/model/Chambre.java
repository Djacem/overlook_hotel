package com.example.hotel.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String type;
    private double prix;
    private boolean disponible;
}