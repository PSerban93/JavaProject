public class Calculator {
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

    public double sum(int first, double second){
        double result = first + second;
        return result;

    }
    public double substract(int first, int second){
        double result = first - second;
        return result;

    }
    public double multiply(int first, int second){
        double result = first * second;
        return result;

    }
    public double divider(int first, int second){
        double result = first / second;
        return result;

    }
    public double modulo(int first, int second){
        double result = first % second;
        return result;
    }
}
