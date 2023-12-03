package com.singleton;

public final class Singleton {
    private static Singleton instance = null;
    // D'autres attributs, classiques et non "static".
    private int x;
    private int y;

    private Singleton() {
        super();
    }

    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Singleton getInstance() {

        if (instance == null) {

            instance = new Singleton();
        }

        return instance;

    }

    public static Singleton getInstance(int x, int y) {

        if (instance == null) {

            instance = new Singleton(x, y);
        }

        return instance;

    }

    // D'autres méthodes classiques et non "static".
    public int somme(int x, int y) {
        return x + y;
    }

    public float moyenne(int x, int y) {

        return somme(x, y) / 2;
    }

    public void affiche() {

        System.out.println(" \t Je suis une instance mesvaleurs sont : x = " + this.x + " et y = " +
                this.y);

    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        throw new CloneNotSupportedException();
    }

}
