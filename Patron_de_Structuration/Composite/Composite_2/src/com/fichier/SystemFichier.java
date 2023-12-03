package com.fichier;


abstract public class SystemFichier {
    private String nom;
    private TypeFichier type;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeFichier getType() {
        return type;
    }

    public void setType(TypeFichier type) {
        this.type = type;
    }

    public abstract void decrire();
    public void ajouter(SystemFichier fichier){}
    public void supprimer(){}

    public SystemFichier obtenir(int index){
        return null;
    }
}
