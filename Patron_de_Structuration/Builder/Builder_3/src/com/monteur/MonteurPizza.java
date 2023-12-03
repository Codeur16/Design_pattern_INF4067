package com.monteur;

import com.pizza.Pizza;

public abstract class MonteurPizza {
    protected Pizza pizza;

    public void creerNouvellePizza() {
        pizza = new Pizza();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public abstract void monterPate();

    public abstract void monterSauce();

    public abstract void monterGarniture();
}
