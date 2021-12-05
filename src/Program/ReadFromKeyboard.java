package Program;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class ReadFromKeyboard {

    public int getInt() {
        int x = 0;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println(Messages.SELECT_NUMBER);
                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_NUMBER);
                x++;
            }
            if (x == 5) {
                sleep(5);
                x = 0;
            }
        } while (true);
    }

    public float getFloat() {
        float x = 0f;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(Messages.SELECT_FLOATNUMBER);
            try {
                x = scanner.nextFloat();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println(Messages.INCORRECT_NUMBER);
            }
        }
        System.out.println(Messages.NUMBER_IS + x);
        return x;
    }

    public double getDouble() {
        double x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(Messages.SELECT_DOUBLENUMBER);
            try {
                x = scanner.nextDouble();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println(Messages.INCORRECT_NUMBER);
            }
        }
        System.out.println(Messages.NUMBER_IS + x);
        return x;
    }

    public long getLong() {
        long x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(Messages.SELECT_LONGNUMBER);
            try {
                x = scanner.nextLong();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println(Messages.INCORRECT_NUMBER);
            }
        }
        System.out.println(Messages.NUMBER_IS + x);
        return x;
    }

    public long getShort() {
        short x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(Messages.SELECT_SHORTNUMBER);
            try {
                x = scanner.nextShort();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println(Messages.INCORRECT_NUMBER);
            }
        }
        System.out.println(Messages.NUMBER_IS + x);
        return x;
    }

    public long getByte() {
        byte x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(Messages.SELECT_BYTENUMBER);
            try {
                x = scanner.nextByte();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println(Messages.INCORRECT_NUMBER);
            }
        }
        System.out.println(Messages.NUMBER_IS + x);
        return x;
    }

    public String getString() {
        String x = "";
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(Messages.SELECT_STRING);
            try {
                x = scanner.next();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println(Messages.INCORRECT_STRING);
            }
        }
        System.out.println(Messages.STRING_IS + x);
        return x;
    }

    public int[] getArray(int size) {
        int[] myArr = new int[size];
        System.out.println(Messages.SELECT_ARRAY_ELEMENT);
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = getInt();
        }
        System.out.print(Messages.ARRAY_IS);
        return myArr;
    }

    public List<Integer> getPopulateList() {
        Scanner number = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        boolean list = true;
        while (list) {
            try {
                System.out.println(Messages.SELECT_NUMBER);
                System.out.println("If you want to stop and see the List type: Exit");
                myList.add(number.nextInt());
            } catch (InputMismatchException er) {
                System.out.println(Messages.INCORRECT_NUMBER);
                list = false;
            }
        }
        System.out.println(Messages.LIST_IS);
        return myList;
    }

        //6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int.
        // In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte.
        // Ex: wait(5) -> asteapta 5 secunde

        public void sleep ( int seconds){
            System.out.print("Timeout for: \n");
            do {
                System.out.println(seconds + " Sec.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                seconds--;
            } while (seconds > 0);

        }

}