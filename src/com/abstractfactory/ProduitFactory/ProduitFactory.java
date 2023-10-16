package com.abstractfactory.ProduitFactory;

import com.abstractfactory.Produit.ProduitA;
import com.abstractfactory.Produit.ProduitB;

public interface ProduitFactory {

    public ProduitA getProduitA();

    public ProduitB getProduitB();
}
