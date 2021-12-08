package Program;

public class MenuOptions {
    ReadFromKeyboard read = new ReadFromKeyboard();
    Calculator calc = new Calculator();


    public void doSuma() {
        int Nr1 = read.getInt();
        int Nr2 = read.getInt();
        System.out.println("Suma este: " +
                calc.suma(Nr1, Nr2));
    }

    public void doScadere() {
        int Nr1 = read.getInt();
        int Nr2 = read.getInt();
        System.out.println("Scaderea este: " +
                calc.scadere(Nr1, Nr2));

    }

    public void doInmultire() {
        int Nr1 = read.getInt();
        int Nr2 = read.getInt();
        System.out.println("Rez. Inmultirii este: " +
                calc.inmultire(Nr1, Nr2));
    }

    public void doImpartire() {
        int Nr1 = read.getInt();
        int Nr2 = read.getInt();
        System.out.println("Rez. Impartirii este: " +
                calc.divide(Nr1, Nr2));
    }

    public void doMedia() {
        double a = read.getDouble();
        double b = read.getDouble();
        double c = read.getDouble();
        System.out.println("Media este: " +
                calc.media(a, b, c));
    }

    public void doRest() {
        int Nr1 = read.getInt();
        int Nr2 = read.getInt();
        System.out.println("Restul este: " +
                calc.rest(Nr1, Nr2));
    }

    public void doFahrenheittoCelsius() {
        double f = read.getDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(f + " °F = " + c + " °C \n");
    }

    public void doCelsiustoFahrenheit() {
        double c = read.getDouble();
        double f = (c * 1.8) + 32;
        System.out.println(c + " °C = " + f + " °F \n");
    }

    public void doInchtoMeters() {
        double inch = read.getDouble();
        double metri = inch * 0.0254;
        System.out.println(inch + " Inch = " + metri + " Metri \n");
    }

    public void doMeterstoInch() {
        double metri = read.getDouble();
        double inch = metri * 39.370079;
        System.out.println(metri + " Metri = " + inch + " Inch \n");
    }
}
