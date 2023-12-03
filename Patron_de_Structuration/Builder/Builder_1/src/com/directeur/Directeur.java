package com.directeur;

import com.monteur.MonteurAbstrait;

public class Directeur {
    private MonteurAbstrait monteur;

    public Directeur(MonteurAbstrait monteur) {
        this.monteur = monteur;
    }

    public void construit() {
        this.monteur.construitPartieA();
        this.monteur.construitPartieB();
    }   
}
