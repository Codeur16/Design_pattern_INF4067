package com.abstractfactory;

import com.abstractfactory.Produit.ProduitA;
import com.abstractfactory.Produit.ProduitB;
import com.abstractfactory.ProduitFactory.ProduitFactory1;
import com.abstractfactory.ProduitFactory.ProduitFactory2;

public class Client {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        ProduitFactory1 produitfactory1 = new ProduitFactory1();
        ProduitFactory2 produitfactory2 = new ProduitFactory2();
        ProduitA produitA = null;
        ProduitB produitB = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitfactory1.getProduitA();
        produitB = produitfactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitfactory2.getProduitA();
        produitB = produitfactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}