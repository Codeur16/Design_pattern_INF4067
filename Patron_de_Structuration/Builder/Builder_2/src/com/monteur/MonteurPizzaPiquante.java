package com.monteur;

public class MonteurPizzaPiquante extends MonteurPizza {
    
        @Override
        public void monterPate() {
            this.pizza.setPate("Feuilletée");
        }
    
        @Override
        public void monterSauce() {
            this.pizza.setSauce("Piquante");
        }
    
        @Override
        public void monterGarniture() {
            this.pizza.setGarniture("Pepperoni + Salami");
        }
}
