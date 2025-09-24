package com.example.hotel.service;

import com.example.hotel.model.Chambre;
import com.example.hotel.repository.ChambreRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ChambreService {
    private final ChambreRepository chambreRepository;
    public ChambreService(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }
}