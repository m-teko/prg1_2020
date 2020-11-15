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
        this.preis = 0.0;
        this.kaufjahr = -1;
    }

    //Methode


    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public int getKaufjahr() {
        return kaufjahr;
    }

    public void setKaufjahr(int kaufjahr) {
        this.kaufjahr = kaufjahr;
    }
}
