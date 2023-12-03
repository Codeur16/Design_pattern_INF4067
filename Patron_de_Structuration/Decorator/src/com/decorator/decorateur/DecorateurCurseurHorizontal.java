package com.decorator.decorateur;

import com.decorator.fenetre.Fenetre;

public class DecorateurCurseurHorizontal extends DecorateurFenetre{

    public DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        this.fenetreDecoree.dessiner();
        System.out.println("Decore Dessine DecorateurCurseurHorizontal");

    }

    @Override
    public void decrire() {
        this.fenetreDecoree.decrire();
        System.out.println("Decore Decrire DecorateurCurseurHorizontal");

    }

    public void dessineCurseurHorizontal(){
        System.out.println("Dessine DecorateurCurseurHorizontal");

    }
}
