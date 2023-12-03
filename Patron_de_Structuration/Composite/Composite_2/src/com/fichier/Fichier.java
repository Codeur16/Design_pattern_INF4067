package com.fichier;

public class Fichier extends SystemFichier{
    @Override
    public void decrire() {
        System.out.println("Nom : "+this.getNom()+" Type : "+this.getType());
    }
}
