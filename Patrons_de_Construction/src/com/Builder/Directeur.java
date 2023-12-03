package com.Builder;

public class Directeur {

    public MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
    public MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();

    public void construire() {
        monteurPizzaReine.creerNouvellePizza();
        monteurPizzaReine.monterPate();
        monteurPizzaReine.monterSauce();
        monteurPizzaReine.monterGarniture();

        monteurPizzaPiquante.creerNouvellePizza();
        monteurPizzaPiquante.monterPate();
        monteurPizzaPiquante.monterSauce();
        monteurPizzaPiquante.monterGarniture();

    }

}
