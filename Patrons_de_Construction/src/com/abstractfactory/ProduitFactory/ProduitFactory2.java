package com.abstractfactory.ProduitFactory;

import com.abstractfactory.Produit.ProduitA;
import com.abstractfactory.Produit.ProduitA2;
import com.abstractfactory.Produit.ProduitB;
import com.abstractfactory.Produit.ProduitB2;

public class ProduitFactory2 implements ProduitFactory {

    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}
