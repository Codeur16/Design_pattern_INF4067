package com.fichier;

import java.util.LinkedList;

public class Dossier extends SystemFichier{

    private LinkedList<SystemFichier> sousRepertoire;


    @Override
    public void decrire() {

    }

    @Override
    public void ajouter(SystemFichier fichier) {
        super.ajouter(fichier);
        this.sousRepertoire.add(fichier);
    }

    @Override
    public void supprimer() {
        super.supprimer();
    }

    @Override
    public SystemFichier obtenir(int index) {
        return super.obtenir(index);
    }
}
