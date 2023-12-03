package com.decorator.decorateur;

import com.decorator.fenetre.Fenetre;

abstract public class DecorateurFenetre implements Fenetre {
    protected Fenetre fenetreDecoree;

    DecorateurFenetre(Fenetre fenetre){
        this.fenetreDecoree = fenetre;
    }



}
