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

}









