package com.Rectangle;

public class Rectangle {
    private float longeur;
    private float largeur;

    public Rectangle(float longeur, float largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public float perimetre(){
        return 2 * (longeur + largeur);
    }
    public float aire(){
        return longeur * largeur;
    }

    public float getLongeur() {
        return longeur;
    }

    public void setLongeur(float longeur) {
        this.longeur = longeur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }
}
