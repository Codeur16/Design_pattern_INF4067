package com.monteur;

public class MonteurPizzaReine extends MonteurPizza{

    @Override
    public void monterPate() {
        this.pizza.setPate("Croisée");
    }

    @Override
    public void monterSauce() {
        this.pizza.setSauce("douce");
    }

    @Override
    public void monterGarniture() {
        this.pizza.setGarniture("Jambon + Champignons");
    }
}
