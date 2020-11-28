package ch.teko.prg.misc01;



public class typenumwandlung {
    public static void main(String[] args) {

        //implizite Beispiele

        byte a = 127; //-128 bis 127
        short b = a;

        short c = 12795; //-32'768 bis 32'767
        int d = c;

        int e = 29678; //-2'147'483'648 bis 2'147'483’647
        long f = e;

        long g = 9200000000000000L; // -2E63 bis 2E63 = -9.22337204*10E18 bis 9.223372037*10E18
        double h = g;

        System.out.println("IMPLIZITE BEISPIELE:");
        System.out.println("byte: " + a);
        System.out.println("Cast von byte zu short: " + b );
        System.out.println();
        System.out.println("short: " + c);
        System.out.println("cast von short zu integer: " + d);
        System.out.println();
        System.out.println("integer: " + e);
        System.out.println("Cast von integer zu long: " + f);
        System.out.println();
        System.out.println("long: " + g);
        System.out.println("Cast von long to double: " + h);

        //explizite Beispiele

        double i = 96432431.998;
        int j = (int) i;

        double k = 75635732.513462;
        float l = (float) k;

        long m = 92123456345L;
        int n = (int) m;

        System.out.println();
        System.out.println();
        System.out.println("EXPLIZITE BEISPIELE:");
        System.out.println("double: " + i);
        System.out.println("Cast von double zu integer: " + j + " <- man beachte den Wertverlust!!");
        System.out.println();
        System.out.println("double: " + k);
        System.out.println("cast von double zu float: " + l + " <- man beachte den Wertverlust!!");
        System.out.println();
        System.out.println("long: " + m);
        System.out.println("Cast von long zu integer: " + n + " <- man beachte den Wertverlust!!");

    }
}
