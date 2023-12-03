package com.directeur;

import com.monteur.MonteurPizza;
import com.pizza.Pizza;

public class Directeur {
    private MonteurPizza monteurPizza;

    public void setMonteurPizza(MonteurPizza mp) {
        monteurPizza = mp;
    }

    public void construirePizza() {
        monteurPizza.creerNouvellePizza();
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
    }

    public Pizza getPizza() {
        return monteurPizza.getPizza();
    }
}
