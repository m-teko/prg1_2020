package ch.teko.prg.tag02.workinclass;

public class Mensch {

    //Attribute
    public String name;
    public String vorname;
    public int alter;
    public int lohn;

    //Konstruktor

    public Mensch(String name, String vorname, int alter, int lohn) {
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.lohn = lohn;
    }

    //Methode

    public String getName(){
        return name;
    }

    public void setLohn(int lohn) {
        this.lohn=lohn;
    }
}
