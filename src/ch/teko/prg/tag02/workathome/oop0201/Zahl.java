package ch.teko.prg.tag02.workathome.oop0201;

public class Zahl {
    //Attribute
    public int x;
    public int y;

    //Konstruktoren

    public Zahl (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Zahl () {
        this.x = 0;
        this.y = 0;
    }

    //Methode


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
