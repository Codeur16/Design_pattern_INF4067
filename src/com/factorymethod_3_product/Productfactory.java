package com.factorymethod_3_product;

public class Productfactory {
    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;
    public static final int TYPE_PRODUITA3 = 3;

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
            case TYPE_PRODUITA3:
                produitA = new ProduitA3();
                break;
            default:
                throw new IllegalArgumentException("TYPE DE PRODUIT INCONNU !");
        }
        return produitA;
    }
}
