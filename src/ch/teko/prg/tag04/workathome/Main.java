package ch.teko.prg.tag04.workathome;

public class Main {
    public static void main(String[] args) {
        Kontrollstruktur Preisberechnung = new Kontrollstruktur("Preisberechnung", 1.0);
        System.out.println("Der Preis ist: " + Preisberechnung.calulatePrice(36) + "CHF");

        Kontrollstruktur Testevaluation = new Kontrollstruktur("Testevaluation", 1.0);
        System.out.println("Das Resulatat ist: ");
        System.out.print(Testevaluation.testEvaluation(-1));

        Kontrollstruktur Counter = new Kontrollstruktur("Counter", 1.0);
        System.out.println(Counter.counter(10));

    }
}
