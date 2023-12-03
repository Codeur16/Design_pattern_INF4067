package com.composite;
import java.util.LinkedList;

public class Section extends Text {

    protected LinkedList<Text> sousSection;


    public Section() {
        this.sousSection = new LinkedList<Text>();

    }

    @Override
    public int longeur() {
        return this.sousSection.size();
    }

    @Override
    public void ajout(Text text) {
        this.sousSection.add(text);
    }

    @Override
    public Text retrait(int index) {
        return this.sousSection.get(index);
    }


}
