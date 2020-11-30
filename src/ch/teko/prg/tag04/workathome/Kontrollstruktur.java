package ch.teko.prg.tag04.workathome;

public class Kontrollstruktur {
    //Attribute

    public String name;
    public double version;

    //Konstruktor

    public Kontrollstruktur(String name, double version) {
        this.name = name;
        this.version = version;
    }


    //Methoden

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }
    public double getVersion() { return version; }
    public void setVersion(double version) { this.version = version; }

    public double calulatePrice(int alter) {
        double Preis;
        if (alter < 6) {
            Preis = 0.0;
        } else if (alter > 6 && alter < 12) {
            Preis = 5.0;
        } else if (alter > 12 && alter < 18) {
            Preis = 10.0;
        } else {
            Preis = 15.0;
            if (alter > 65) {
                Preis = Preis / 100 * 50;
            }
        }
        return Preis;
    }

    public String testEvaluation(int Punkte){
        switch (Punkte){
            case 10:
                System.out.println("Sehr gut");
                break;
            case 9:
                System.out.println("Gut");
                break;
            case 8:
                System.out.println("Befriedigend");
                break;
            default:
                System.out.println("Ungenügend - nicht genug Punkte");
        }
            return "";
    }

}