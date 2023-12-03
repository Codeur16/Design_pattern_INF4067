package com.composite;

public class Paragraph extends Text{
    @Override
    public int longeur() {
        return this.getTitre().length();
    }

}
