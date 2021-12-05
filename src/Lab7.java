import Program.Messages;
import Program.ReadFromKeyboard;

public class Lab7 {

    public static void main(String[] args) throws Exception {
        ReadFromKeyboard read = new ReadFromKeyboard();
        LogicalOperations op = new LogicalOperations();
       // Scanner scan = new Scanner(System.in);
        System.out.println("""
                1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.
                """);

        int x = read.getInt();
        System.out.println(Messages.NUMBER_IS + x);

        System.out.println("""
                
                2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode, 
                care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)
                """);

        read.getFloat();

        read.getDouble();

        read.getLong();

        read.getShort();

        read.getByte();

        read.getString();

        System.out.println("""
                
                3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura. 
                Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.
                """);

        int[] result = read.getArray(6);
        op.printArrayinline(result);

        System.out.println("""
                
                
                4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura. 
                Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch. 
                (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
                """);

        op.printList(read.getPopulateList());

        System.out.println("""
                
                5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar. 
                Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit, 
                iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: 
                "Inside catch, number too large".\s
                """);
        int[] array = {3,5,8,9,12};
        op.getPosition(array,8);
    }
}
