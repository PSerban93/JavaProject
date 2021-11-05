public class Lab3 {

    public static void main(String[] args){

        System.out.println("\nEx1. Given two numbers, see wich one is the greatest and print it\n");

        int x = 10;
        int y = 13;

        LogicalOperations op = new LogicalOperations();
        System.out.println(op.getHigherNumber(x, y));

        System.out.println("\nEx2. Given a text input, if it is “FastTrack”, then print “Learning text comparison”.\n" +
                "If not, print “Got to try some more”\n");

        String text1 = "FastTrack";
        System.out.println(op.verifyText1(text1));

        System.out.println("\nEx3. Given a number, if it’s equal to or higher\n" +
                "than 2 and equal to or lower than 8, print the number\n");

        int nr = 5;
        System.out.println(op.getEqualorHigher(nr));


        System.out.println("\nEx4. Given a text input and a number input, if the text is\n" +
                "equal to “FastTrack” AND the number is equal to or lower than 3,\n" +
                "print the text and the number. If the text is not “FastTrack”\n" +
                "AND the number is equal to or higher than 4, print the number\n" +
                "and the text, in this order.\n");

        String text = "FastTrack";
        int numar = -2;
        System.out.println(op.verifyProvidedText(numar, text));



        System.out.println("\nEx5. Given a number input, if it is higher than 8 OR equal to 6,\n"+
                "print “The amount of snow this winter was(cm):” and the given number.\n" +
                "Else print “The forecast snow is(cm):\n");

        System.out.println(op.verifySnow(23));

        System.out.println("\nEx6. Given a number input, if the number is greater than 3 \n" +
                "but not equal to 4, print “The number is greater than 3 and not equal to 4\".\n" +
                "Else if the number is equal to 4 print “The number is equal to 4”.\n" + "" +
                "Else if the number is lower than 3 print “The number is lower than 3\"\n");

        System.out.println(op.verifyIf(3.5));

        System.out.println("\nEx7. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit. \n" +
                "Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul \n" +
                "\"The number is:  x !\" unde x trebuie sa reprezinte numarul apasat.\n" +
                "Pentru exemplul de fata sa nu se foloseasca concatenarea stringului \"The number is:\"      \n" +
                "cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.\n"+
                "Apelati metoda in main() pentru a verifica daca functioneaza.\n");


        op.switchcase(3);

        System.out.println("\nEx8. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, \n" +
                "si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false. \n" +
                "Apelati metoda in main() pentru a verifica daca functioneaza.\n");

        System.out.println(op.isNumberEven(232));

        System.out.println("\nEx9. Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,\n" +
                "care sa reprezinte varsta, iar metoda sa iti zica daca persoana are drept de vot. \n" +
                "Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false. \n" +
                "Apelati metoda in main() pentru a verifica daca functioneaza.\n");

        System.out.println(op.isEligibleToVote(29));


        System.out.println("\nEx10. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.\n" +
                "Apelati metoda in main() pentru a verifica daca functioneaza.\n");

        int nr1 = 350;
        int nr2 = 20;
        int nr3 = -9;

        System.out.println(op.higherNumber(nr1, nr2, nr3));








    }
}
