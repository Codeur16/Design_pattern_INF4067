package com.adaptateur;

import com.Icarre.ICarre;
import com.Rectangle.Rectangle;

public class AdaptRectangle extends ICarre {

   Rectangle rectangle;

   public  AdaptRectangle(Rectangle rect){
       rectangle = rect;
   }

        @Override
        public float perimetre() {
            rectangle.setLargeur(cote);
            rectangle.setLongeur(cote);
            return rectangle.perimetre();
        }

        @Override
        public float aire() {
            rectangle.setLargeur(cote);
            rectangle.setLongeur(cote);
            return rectangle.aire();
        }


}
