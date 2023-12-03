package com.abstractfactory.ProduitFactory;

import com.abstractfactory.Produit.ProduitA;
import com.abstractfactory.Produit.ProduitA1;
import com.abstractfactory.Produit.ProduitB;
import com.abstractfactory.Produit.ProduitB1;

public class ProduitFactory1 implements ProduitFactory {

    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}
