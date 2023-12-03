package com.decorator.decorateur;

import com.decorator.fenetre.Fenetre;

public class DecorateurCurseurVertical extends DecorateurFenetre{

    public DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        this.fenetreDecoree.dessiner();
        System.out.println("Decore Dessine DecorateurCurseurVertical");
    }

    @Override
    public void decrire() {
        this.fenetreDecoree.decrire();
        System.out.println("Decore Decrire DecorateurCurseurVertical");
    }

    public void dessineCurseurVertical(){
        System.out.println("Dessine DecorateurCurseurVertical");
    }
}
