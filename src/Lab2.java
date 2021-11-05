public class Lab2 {
    public static int x = 35;
    public static int y = 10;
    public static double f = 117;
    public static double c = (f - 32) * 5 / 9;
    public static double inch = 30;
    public static double metri = inch * 0.0254;

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Print print = new Print();

        print.printTema1();

        print.printOperatiiMatematice();

        int rezultatadunare = calc.adunare(x, y);
        System.out.println(rezultatadunare);

        int rezultatscadere = calc.scadere(x, y);
        System.out.println(rezultatscadere);

        int rezultatinmultire = calc.inmultire(x, y);
        System.out.println(rezultatinmultire);

        double rezultatdivide = calc.divide(x, y);
        System.out.println(rezultatdivide);

        print.printJava();

        print.printMediaNumerelor();
        System.out.println(calc.media(10, 5, 8));

        print.printFrankenstein();

        print.printRest();
        int rezultatrest = calc.rest(x, y);
        System.out.println(rezultatrest);

        print.printCelsiusCalculator();
        double rezultatgrade = calc.grade(f, c);
        System.out.println(rezultatgrade);

        print.printInchCalculator();
        double rezultatconvert = calc.convert(inch, metri);
        System.out.println(rezultatconvert);

        print.printSpeedCalculator();
        calc.calculviteza(3500,5,35,15);
    }


}
