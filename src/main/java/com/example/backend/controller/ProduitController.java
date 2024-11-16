package com.example.backend.controller;

import com.example.backend.model.Produit;
import com.example.backend.service.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {
    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public List<Produit> getAllProduits() {
        return produitService.findAll();
    }

    @PostMapping
    public Produit createProduit(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id) {
        produitService.deleteById(id);
    }
}
