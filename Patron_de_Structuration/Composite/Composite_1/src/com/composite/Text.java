package com.composite;

abstract public class Text {
    private String titre;
    private String preambule;

    public abstract int longeur();

    public void ajout(Text text){}

    public Text retrait(int index){
        return null;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getPreambule() {
        return preambule;
    }

    public void setPreambule(String preambule) {
        this.preambule = preambule;
    }
}
