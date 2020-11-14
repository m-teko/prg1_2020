package ch.teko.prg.tag02.workathome;

public class Book {
    //Attribute
    public String titel;
    public String autor;
    public double preis;
    public int kaufjahr;

    //Konstruktor

    public Book(String titel, String autor, double preis, int kaufjahr) {
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        this.kaufjahr = kaufjahr;

    }

    public Book(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
        this.preis = double("0.0");


    }



    //Methode


}
