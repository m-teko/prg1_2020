package ch.teko.prg.tag02.workathome;

public class Main {

    public static void main(String[] args) {
        Book Nr1 = new Book ("Grundwissen Java","Dörn", 25.30, 2020);
        Book Nr2 = new Book ("Mathematik", "Müller");

        System.out.println("Book Nr1");
        System.out.println("Titel: " + Nr1.titel);
        System.out.println("Autor: " + Nr1.autor);
        System.out.println("Preis: " + Nr1.preis);
        System.out.println("Kaufjahr: " + Nr1.kaufjahr + "\n");

        System.out.println("Book Nr2");
        System.out.println("Titel: " + Nr2.titel);
        System.out.println("Autor: " + Nr2.autor);
        System.out.println("Preis: " + Nr2.preis);
        System.out.println("Kaufjahr: " + Nr2.kaufjahr);
    }
}
