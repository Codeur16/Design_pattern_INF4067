package com.Builder;

public class Client {

    
    public static void main(String[]args){
         Directeur directeur = new Directeur();
        Pizza PizzaReine;
        Pizza PizzaPiquante;

        directeur.construire();
        PizzaReine= directeur.monteurPizzaReine.getPizza();
        PizzaPiquante= directeur.monteurPizzaPiquante.getPizza();
        System.out.println("Pizza Reine OK!!");
        System.out.println("");
        System.out.println("");
        System.out.println("Pizza Picante Ok!!");
        
    }

}
