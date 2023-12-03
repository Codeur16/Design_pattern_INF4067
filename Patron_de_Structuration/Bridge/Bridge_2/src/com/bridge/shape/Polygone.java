package com.bridge.shape;

import com.bridge.color.Color;

public class Polygone extends Shape{
    public Polygone(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Polygone filled with : ");
        this.color.fillColor();
    }

}
