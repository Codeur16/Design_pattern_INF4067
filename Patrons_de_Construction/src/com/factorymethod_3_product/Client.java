package com.factorymethod_3_product;

public class Client {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Productfactory productfactory = new Productfactory();
        ProduitA produitA = null;

        produitA = productfactory.getProduit(productfactory.TYPE_PRODUITA1);
        produitA.MethodeA();

        produitA = productfactory.getProduit(productfactory.TYPE_PRODUITA2);
        produitA.MethodeA();

        produitA = productfactory.getProduit(productfactory.TYPE_PRODUITA3);
        produitA.MethodeA();

        produitA = productfactory.getProduit(0);
        produitA.MethodeA();
    }
}