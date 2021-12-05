import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LogicalOperations {

    public int getHigherNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String verifyText1(String text1) {
        if (text1.equals("FastTrack")) {
            return "\nLearning text comparison";
        } else if (!text1.equals("FastTrack")) {
            return "\nGot to try some more";
        }
        return "\nNot good";
    }

    public int getEqualorHigher(int first) {
        if (first >= 2 && first <= 8) {
            return first;
        } else {
            return 0;
        }
    }

    public String verifyProvidedText(int numar, String text) {
        if (text.equals("FastTrack") && numar <= 3) {
            return (text + numar);
        } else if (!text.equals("\nFastTrack") && numar >= 4) {
            return (numar + text);
        } else {
            return ("Not Found");
        }
    }

    public String verifySnow(int number) {
        if (number > 8 || number == 6) {
            return ("\nThe amount of snow this winter was(cm):" + number);
        } else {
            return ("\nThe forecast snow is(cm):" + number);
        }
    }

    public String verifyIf(double n) {
        if ((n > 3) && (n != 4)) {
            return "\nThe number is greater than 3 and not equal to 4";
        } else if (n == 4) {
            return "\nThe number is equal to 4";
        } else if (n < 3) {
            return "\nThe number is lower than 3";
        } else {
            return "\nInvalid number";
        }
    }

    public void switchcase(int number) {

        switch (number) {
            case 1:
                System.out.println("The number is 5");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 9");
                break;
            case 4:
                System.out.println("The number is 4");
            default:
                System.out.println("The number is not good, Try Again!");
        }
    }

    public boolean isNumberEven(int nr2) {
        if ((nr2 % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(double age) {
        if ((age > 18) & age <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public static int higherNumber(int nr1, int nr2, int nr3) {
        if ((nr1 > nr2) & nr1 > nr3) {
            System.out.println("Higher Nr. is:");
            return nr1;
        }
        if ((nr2 > nr1) & nr2 > nr3) {
            System.out.println("Higher Nr. is:");
            return nr2;
        }
        if ((nr3 > nr2) & nr3 > nr1) {
            System.out.println("Higher Nr. is:");
            return nr3;
        }
        if ((nr1 == nr2) & nr1 == nr3) {
            System.out.println("All Nr. are equals");
            return nr1;
        } else {

            return 0;
        }
    }


    //Tema - Java For Loops
    public void countForward(int nr) {
        for (int a = nr; a <= 100; a++) {
            System.out.println(a);
        }

    }


    public void counttominus(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }


    public void counttonumber(int x, int y) {
        for (int n = x; x <= y; x++)
            System.out.println(x);
    }


    public void countfrontorback(int a, int b) {
        for (int z = a; a < b; a++)
            System.out.println(a);
        for (int x = b; b < a; b++)
            System.out.println(b);
    }


    public void evennumbers(int e) {
        for (int q = e; e <= 100; e++) {
            if (q % 2 == 0) {
                System.out.println(e);
            }
        }
    }


    public void oddnumbers(int o) {
        for (int f = o; o <= 100; o++) {
            if (o % 2 != 0) {
                System.out.println(o);
            }
        }
    }

    public float getsum(int frst) {
        float suma = 0;
        for (int s = frst; s <= 100; s++) {
            suma = s + suma;

        }
        return suma;
    }


    public float getAverageFromInterval(int start) {
        float sum = 0;
        for (int i = start; i <= 100; i++) {
            sum = i + sum;
        }
        return sum / (100 - start + 1);
    }


    public void gettwoloops(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = value; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    //Tema - Java While Loop
    public void countto100(int strt) {
        int p = strt;
        int count = p;
        while (p <= 100) {
            System.out.println(count);
            count++;
            p++;
        }
    }

    public void counttominus100(int minus) {
        int u = minus;
        int count = u;
        while (u >= -100) {
            System.out.println(count);
            count--;
            u--;
        }
    }

    public void countbetween(int x1, int y1) {
        if (x1 <= y1)
            while (x1 <= y1) {
                System.out.println(x1);
                x1++;
            }
    }

    public void counttohighernumber(int x2, int y2) {
        if (x2 <= y2)
            while (x2 <= y2) {
                System.out.println(x2);
                x2++;
            }
        while (x2 >= y2) {
            System.out.println(y2);
            y2++;
        }
    }

    public void evenwhilenumbers() {
        int r = 1;
        while (r <= 100) {
            if ((r % 2) == 0) {
                System.out.println(r);
            }
            r++;
        }
    }

    public void oddwhilenumbers() {
        int v = 1;
        while (v <= 100) {
            if ((v % 2) != 0) {
                System.out.println(v);
            }
            v++;
        }
    }

    public float getsumandaverage() {
        int j = 111;
        long suma = 0;
        int count = 0;
        while (j >= 111 && j <= 8899) {
            suma += j;
            j++;
            count++;
        }
        System.out.println("Count = " + count);
        System.out.println("Sum = " + suma);
        System.out.println("Average = ");
        return suma / count;
    }

    public float getAverageDivisibleBySeven(int start, int max) {
        int x = start;
        float sum = 0;
        int count = 0;
        while (x <= max) {
            if (x % 7 == 0) {
                sum += x; // sum = sum + x;
                count++;
            }

            x++;
        }
        return sum / count;
    }

    public void getFibanacci() {
        int i = 1, n = 20, t1 = 0, t2 = 1;
        while (i <= n) {
            System.out.println(t1);
            int nextterm = t1 + t2;
            t1 = t2;
            t2 = nextterm;
            i++;
        }
    }

    public void cozaLozaWoza() {
        int numarul = 1;
        while (numarul <= 110) {
            if (numarul % 3 != 0 && numarul % 5 != 0 && numarul % 7 != 0)
                System.out.print(numarul + " ");

            else if (numarul % 3 == 0 && numarul % 5 != 0 && numarul % 7 != 0) {
                System.out.print("Coza ");
            } else if (numarul % 5 == 0 && numarul % 3 != 0 && numarul % 7 != 0) {
                System.out.print("Loza ");
            } else if (numarul % 7 == 0 && numarul % 3 != 0 && numarul % 5 != 0) {
                System.out.print("Woza ");
            } else if (numarul % 3 == 0 && numarul % 5 == 0 && numarul % 7 != 0) {
                System.out.print("CozaLoza ");
            } else if (numarul % 3 == 0 && numarul % 7 == 0 && numarul % 5 != 0) {
                System.out.print("CozaWoza ");
            } else if (numarul % 5 == 0 && numarul % 7 == 0 && numarul % 3 != 0) {
                System.out.print("WozaLoza ");
            } else if (numarul % 3 == 0 && numarul % 5 == 0 && numarul % 7 == 0) {
                System.out.print("CozaLozaWoza ");

            } else {

                System.out.print(numarul + " ");

            }
            if (numarul % 11 == 0) {
                System.out.println();
            }
            numarul++;
        }
    }

    public int[] populateArray(int max) {
        int[] myArray = new int[max];
        for (int i = 0; i < max; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public void printArrayinline(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public int[] evenArray(int[] array) {
        int q = 0;
        for (int e = 1; e <= 100; e++) {
            if (e % 2 == 0) {
                array[q] = e;
                q++;
            }
        }
        return array;
    }


    public float getAverageValueFromArray(int[] array) {
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        return (sum / array.length);
    }

    public boolean isValueInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) ;
            {
                return true;
            }
        }
        return false;
    }

    public int checkNumberinarray(int[] ary, int nr) {
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == nr) {
                return i;
            }
        }
        return -1;
    }

    public String[] setArraygrid(int max) {
        String[] myArraygrid = new String[max];
        for (int i = 0; i < max; i++) {
            myArraygrid[i] = "- \n";
        }
        return myArraygrid;
    }


    public void printGrid(String[] myArraygrid, int nr) {
        for (int i = 0; i <= nr; i++) {
            printGrid(myArraygrid);
            System.out.println("\n");
        }
    }

    public void printGrid(String[] myArraygrid) {
        for (int i = 0; i <= 9; i++) {
            System.out.print("- ");
        }
    }

    public void removeNrFromArray(int[] tarr, int Value) {

        int[] sarr = new int[tarr.length];
        int j = 0;

        for (int i = 0; i < tarr.length; i++) {

            if (tarr[i] == Value)
                continue;
            sarr[j++] = tarr[i];
        }
        int[] farr = new int[j];
        for (int i = 0; i < j; i++)
            farr[i] = sarr[i];
        for (int l = 0; l < farr.length; l++)
            System.out.print(farr[l] + ",");
    }

    public void secondminArray(int[] array) {
        int min = 1000;
        int min2 = 1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];
            } else if (array[i] < min2) {
                min2 = array[i];
            }
        }
        System.out.println(min2);
    }

    public void copyArray(int[] myArray3, int[] emptyArray) {

        for (int i = 0, j = 0; i < myArray3.length; i++) {
            emptyArray[j] = myArray3[i];
            j++;
        }
        for (int i = 0; i < emptyArray.length; i++)
            System.out.print(emptyArray[i] + ",");
    }

    public static int[] insertX(int n, int iarr[], int x, int pos) {
        int i;
        int newarr[] = new int[n + 1];

        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = iarr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = iarr[i - 1];
        }
        return newarr;
    }

    public void getBigandSmall() {
        int small;
        int large;
        int i;
        int a[] = new int[]{33, 53, 73, 94, 22, 45, 23, 87, 13, 63};
        int n = a.length;
        large=small=a[0];
        for(i=1;i<n;++i) {
            if (a[i] > large)
                large = a[i];

            if (a[i] < small)
                small = a[i];
        }
        System.out.println("Array: " + (Arrays.toString(a)));
        System.out.print("Small " + small );
        System.out.print("\nBig " + large );
    }

    public void invertArray(int inarr[]){
        for(int i=inarr.length-1;i>=0;i--)
            System.out.print(inarr[i] + "  ");
    }


    public List<Integer> getPopulatedList(int max) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myList.add(i);
        }
        return myList;
    }

    public List<Integer> addtoList(List<Integer> myList, int number) {
        myList.add(number);
        return myList;
    }

    public void printList(List<Integer> myList2) {
        for (int i = 0; i < myList2.size(); i++) {
            System.out.println(myList2.get(i));
        }
    }

    public void printListFromNumber(List<Integer> myList, int number) {
        for (int i = number; i <= myList.size(); i++) {
            System.out.println(myList.get(i - 1));
        }
    }

    public void printReverse(List<Integer> myList, int nrs) {
        for (int i = myList.size(); i >= nrs; i--) {
            System.out.println(myList.get(i - 1));
        }
    }

    public List<String> addStringtoPos(List<String> slist, int poz, String prmt) {
        slist.add(poz, prmt);
        return slist;
    }

    public List<String> addStringtofrstPos(List<String> slist, String parameter) {
        slist.add(0, parameter);
        return slist;
    }

    public void valorisipozitie(List<String> vllist) {
        for (int i = 0; i < vllist.size(); i++) {
            String valsipoz = "Poz. " + i + " are val. " + vllist.get(i);
            System.out.println(valsipoz);
        }
    }

    public int getBgstnr(List<Integer> bgstlist) {
        int max = 0;
        for (int i = 0; i < bgstlist.size(); i++) {
            if (bgstlist.get(i) > max) {
                max = bgstlist.get(i);
            }
        }
        return max;
    }

    public void nrpare(List<Integer> parlist) {
        for (int i = 1; i <= parlist.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
    }

    public void getPosition (int[] aArray, int pos ) {
        try {
                System.out.println("The Number in Position " + pos +" is: ");
                System.out.println(aArray[pos]);
            }
            catch (ArrayIndexOutOfBoundsException err){
                System.out.println("Inside catch, number too large");
            }
        }
    }






















