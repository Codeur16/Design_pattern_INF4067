package com.monteur;

public class MonteurPizzaLocale extends MonteurPizza {
        
        @Override
        public void monterPate() {
            this.pizza.setPate("Locale");
        }
    
        @Override
        public void monterSauce() {
            this.pizza.setSauce("Jaune");
        }
    
        @Override
        public void monterGarniture() {
            this.pizza.setGarniture("...");
        }   
}
