public class Calculator {

    public static int suma(int Nr1, int Nr2) {
        int rezultat = Nr1 + Nr2;
        return rezultat;
    }
    public static int suma(int Nr1, int Nr2, int Nr3) {
        int rezultat = Nr1 + Nr2 + Nr3;
        return rezultat;
    }

    public static double impartire(double Nr1, double Nr2) {
        double rezultat = Nr1 / Nr2;
        return rezultat;
    }
    public static double impartire(double Nr1, double Nr2, double Nr3) {
        double rezultat = Nr1 / Nr2 / Nr3;
        return rezultat;
    }

    public static int operatiunia(int Nr1, int Nr2, int Nr3) {
        int rezultat = Nr1 + Nr2 * Nr3;
        return rezultat;
    }
    public static int operatiunia(int Nr1, int Nr2, int Nr3, int Nr4) {
        int rezultat = Nr1 + Nr2 * Nr3 * Nr4;
        return rezultat;
    }

    public static int operatiunib(int Nr1, int Nr2, int Nr3) {
        int rezultat = (Nr1 + Nr2) % Nr3;
        return rezultat;
    }
    public static int operatiunib(int Nr1, int Nr2, int Nr3, int Nr4) {
        int rezultat = (Nr1 + Nr2) % Nr3 + Nr4;
        return rezultat;

    }
    public static double operatiunic(double Nr1, double Nr2, double Nr3, double Nr4) {
        double rezultat = Nr1 + -Nr2 * Nr3 / Nr4;
        return rezultat;
    }

    public static double operatiunid(double Nr1, double Nr2, double Nr3, double Nr4, double Nr5, double Nr6) {
        double rezultat = Nr1 + Nr2 / Nr3 * Nr4 - Nr5 % Nr6;
        return rezultat;

    }

    public static int adunare(int first, int second) {
        System.out.println("Adunare:");
        int result = first + second;
        return result;

    }

    public static int scadere(int first, int second) {
        System.out.println("Scadere:");
        int result = first - second;
        return result;

    }

    public static int inmultire(int first, int second) {
        System.out.println("Inmultire:");
        int result = first * second;
        return result;

    }

    public static double divide(double first, double second) {
        System.out.println("Impartire:");
        double result = first / second;
        return result;
    }

    public static double media(double a, double b, double c) {
        double rezultat = ((a + b + c)) / 3;
        return rezultat;
    }

    public static int rest(int first, int second) {
        int result = first % second;
        return result;
    }


    public static double grade(double first, double second) {
        System.out.println( first + " °F"  );
        double f = first;
        System.out.println("°C = ");
        double c = second;
        double rezultatgrade = c;
        return rezultatgrade;
    }
    public static double convert(double first, double second) {
        System.out.println(+first + " Inch to");
        double inch = first;
        System.out.println("Metri = ");
        double metri = second;
        double rezultatconvert = metri;
        return rezultatconvert;
    }
    public static void calculviteza(double distance, int hour, int minutes, int seconds) {
        double mps = distance / ((hour * 3600) + (minutes * 60) + seconds);
        System.out.println("\nMetrii pe secunda\n" + mps);
        double kph = mps * 3.6;
        System.out.println("\n Km pe ora\n" + kph);
        double milph = kph / 1.609;
        System.out.println("\n Mile pe ora\n" + milph);
    }


}
