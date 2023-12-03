package com.factorymethod;

public class Productfactory {
    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;

    // Methode de fabrique de produit
    public ProduitA getProduit(int type_produit) {

        ProduitA produitA = null;

        switch (type_produit) {
            case TYPE_PRODUITA1:
                produitA = new ProduitA1();
                break;
            case TYPE_PRODUITA2:
                produitA = new ProduitA2();
                break;
            default:
                throw new IllegalArgumentException("TYPE DE PRODUIT INCONNU !");
        }
        return produitA;
    }
}
