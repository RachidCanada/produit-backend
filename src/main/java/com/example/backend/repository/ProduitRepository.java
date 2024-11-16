package com.example.backend.repository;

import com.example.backend.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface pour le repository Produit
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
