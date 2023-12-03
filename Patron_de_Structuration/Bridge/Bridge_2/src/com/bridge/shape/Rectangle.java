package com.bridge.shape;

import com.bridge.color.Color;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Rectangle filled with : ");
        this.color.fillColor();
    }
}
