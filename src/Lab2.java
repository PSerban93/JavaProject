public class Lab2 {
    public static int x = 35;
    public static int y = 10;
    public static void main(String[] args) {
        printTema1();

        printOperatiiMatematice();

        int rezultatadunare = adunare(x, y);
        System.out.println(rezultatadunare);

        int rezultatscadere = scadere(x, y);
        System.out.println(rezultatscadere);

        int rezultatinmultire = inmultire(x, y);
        System.out.println(rezultatinmultire);

        double rezultatdivide = divide(x, y);
        System.out.println(rezultatdivide);

        printJava();

        printMediaNumerelor();

        printFrankenstein();

        printRest();
        int rezultatrest = rest(x, y);
        System.out.println(rezultatrest);

        printCelsiusCalculator();
        double f = 117;
        double c = (f - 32) * 5 / 9;
        double rezultatgrade = grade(f, c);
        System.out.println(rezultatgrade);

        printInchCalculator();
        double inch = 30;
        double metri = inch * 0.0254;
        double rezultatconvert = convert(inch, metri);
        System.out.println(rezultatconvert);

        printSpeedCalculator();
        calculviteza(3500,5,35,15);
    }

    public static void printTema1() {

        System.out.println("\n Ex1. \n" +
                "             Hello \n" +
                "             Serban\n");
        System.out.println("      Suma a doua numere este: " + suma(28, 1993));
        System.out.println("      Rezultatul impartiri a doua numere este: " + impartire(1258, 288));
        System.out.println("      Printati rezultatul urmatoarelor operatiuni: a. " + operatiunia(-5, 8, 6));
        System.out.println("      Printati rezultatul urmatoarelor operatiuni: b. " + operatiunib(55, 9, 9));
        System.out.println("      Printati rezultatul urmatoarelor operatiuni: c. " + operatiunic(20, 3, 5, 8));
        System.out.println("      Printati rezultatul urmatoarelor operatiuni: d. " + operatiunid(5, 15, 3, 2, 8, 3));

    }

    public static int suma(int Nr1, int Nr2) {
        int rezultat = Nr1 + Nr2;
        return rezultat;
    }

    public static double impartire(double Nr1, double Nr2) {
        double rezultat = Nr1 / Nr2;
        return rezultat;
    }

    public static int operatiunia(int Nr1, int Nr2, int Nr3) {
        int rezultat = Nr1 + Nr2 * Nr3;
        return rezultat;
    }

    public static int operatiunib(int Nr1, int Nr2, int Nr3) {
        int rezultat = (Nr1 + Nr2) % Nr3;
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

    public static void printOperatiiMatematice() {
        System.out.println("\n Ex2.\n");
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

    public static void printJava() {
        System.out.println("\n Ex3.                        \n" +
                "                                          \n" +
                "    J       a      v     v       a        \n" +
                "    J     a   a     v   v      a   a      \n" +
                "J   J   a a a a a    v v     a a a a a    \n" +
                " JJJ   a         a    v     a         a   \n");


    }

    private static void printMediaNumerelor() {
        System.out.println("Ex4. \n " +
                "\n Media Numerelor = " + media(10, 5, 8));
    }

    public static double media(double a, double b, double c) {
        double rezultat = ((a + b + c)) / 3;
        return rezultat;
    }

    public static void printFrankenstein() {
        System.out.println("\n Ex5.\n" +
                "                  \n" +
                "    +'''''''+       \n" +
                "   [|  O O  |]      \n" +
                "    |   ^   |       \n" +
                "    | ' _ ' |       \n" +
                "    +_______+       \n");


    }

    public static void printRest() {
        System.out.println("\n Ex6.\n" +
                "\nRestul Impartirii a doua numere:");
    }

    public static int rest(int first, int second) {
        System.out.println("Rest: ");
        int result = first % second;
        return result;

    }

    public static void printCelsiusCalculator() {
        System.out.println("\nEx.7\n" +
                "\nCalc. Grade:");
    }

    public static double grade(double first, double second) {
        System.out.println( first + " °F"  );
        double f = first;
        System.out.println("°C = ");
        double c = second;
        double rezultatgrade = c;
        return rezultatgrade;
    }

    public static void printInchCalculator() {
        System.out.println("\nEx.8\n" +
                "\nConvert Inch to Meter:");
    }

    public static double convert(double first, double second){
        System.out.println( + first +  " Inch to");
        double inch = first;
        System.out.println("Metri = ");
        double metri = second;
        double rezultatconvert = metri;
        return rezultatconvert;
    }
    public static void printSpeedCalculator() {
        System.out.println("\n Ex9.Calcul Viteza");
    }
    public static void calculviteza(double distance, int hour, int minutes, int seconds){
        double mps = distance / ((hour * 3600) + (minutes * 60) + seconds);
        System.out.println("\nMetrii pe secunda\n" + mps);
        double kph = mps * 3.6;
        System.out.println("\n Km pe ora\n" + kph);
        double milph = kph / 1.609;
        System.out.println("\n Mile pe ora\n" + milph);

    }
}
