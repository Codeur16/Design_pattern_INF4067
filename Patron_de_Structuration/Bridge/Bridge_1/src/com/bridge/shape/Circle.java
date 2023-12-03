package com.bridge.shape;

import com.bridge.color.Color;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Circle filled with : ");
        this.color.fillColor();
    }

}
