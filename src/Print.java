public class Print {
    public static void printJava() {
        System.out.println("\n Ex3.                        \n" +
                "                                          \n" +
                "    J       a      v     v       a        \n" +
                "    J     a   a     v   v      a   a      \n" +
                "J   J   a a a a a    v v     a a a a a    \n" +
                " JJJ   a         a    v     a         a   \n");
    }
    public static void printFrankenstein() {
        System.out.println("\n Ex5.\n" +
                "                  \n" +
                "    +'''''''+       \n" +
                "   [|  O O  |]      \n" +
                "    |   ^   |       \n" +
                "    | ' _ ' |       \n" +
                "    +_______+       \n");}
    public static void printTema1() {
        Calculator calc = new Calculator();

        System.out.println("\n Ex1. \n" +
                "             Hello \n" +
                "             Serban\n");
        System.out.println("      Suma a doua numere este: " + calc.suma(28, 1993));
        System.out.println("      Rezultatul impartiri a doua numere este: " + calc.impartire(1258, 288));
        System.out.println("      Printati rezultatul urmatoarelor operatiuni: a. " + calc.operatiunia(-5, 8, 6));
        System.out.println("      Printati rezultatul urmatoarelor operatiuni: b. " + calc.operatiunib(55, 9, 9));
        System.out.println("      Printati rezultatul urmatoarelor operatiuni: c. " + calc.operatiunic(20, 3, 5, 8));
        System.out.println("      Printati rezultatul urmatoarelor operatiuni: d. " + calc.operatiunid(5, 15, 3, 2, 8, 3));
    }
    public static void printOperatiiMatematice() {
        System.out.println("\n Ex2.\n");
    }
    public static void printMediaNumerelor() {
        System.out.println("Ex4. \n " +
                "\n Media Numerelor = ");
    }

    public static void printRest() {
        System.out.println("\n Ex6.\n" +
                "\nRestul Impartirii a doua numere:");
    }


    public static void printCelsiusCalculator() {
        System.out.println("\nEx.7\n" +
                "\nCalc. Grade:");
    }


    public static void printInchCalculator() {
        System.out.println("\nEx.8\n" +
                "\nConvert Inch to Meter:");
    }



    public static void printSpeedCalculator() {
        System.out.println("\n Ex9.Calcul Viteza");
    }


}

