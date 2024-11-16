package com.example.backend.service;

import com.example.backend.model.Produit;
import com.example.backend.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    public void deleteById(Long id) {
        produitRepository.deleteById(id);
    }
}
