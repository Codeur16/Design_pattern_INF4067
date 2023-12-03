package com.bridge.shape;

import com.bridge.color.Color;

abstract public class Shape {
    protected Color color;

    Shape(Color color){
        this.color = color;
    }

    abstract public void colorIt();
}
