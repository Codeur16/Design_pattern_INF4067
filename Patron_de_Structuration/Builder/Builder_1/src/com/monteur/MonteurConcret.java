package com.monteur;

import com.produit.Produit;

public class MonteurConcret extends MonteurAbstrait {

    @Override
    public void construitPartieA() {
        System.out.println("Je Construit la partie A du produit");
    }

    @Override
    public void construitPartieB() {
        System.out.println("Je Construit la partie B du produit");
    }

    public Produit geProduit(){
        return new Produit("Produit", 10.0);
    }
    
}
