package Program;

public class Submenu extends MenuOptions {
    ReadFromKeyboard read = new ReadFromKeyboard();

    public boolean runSubMenuOptions() {
        System.out.println(Messages.OP_MAT);

        int suboption = read.getInt();

        switch (suboption) {
            case 0:
                System.out.println("Return");
                return true;
            case 1:
                System.out.println("Suma:");
                doSuma();
                return runSubMenuOptions();

            case 2:
                System.out.println("Scadere:");
                doScadere();
                return runSubMenuOptions();
            case 3:
                System.out.println("Inmultire:");
                doInmultire();
                return runSubMenuOptions();
            case 4:
                System.out.println("Impartire:");
                doImpartire();
                return runSubMenuOptions();
            case 5:
                System.out.println("Media:");
                doMedia();
                return runSubMenuOptions();
            case 6:
                System.out.println("Rest:");
                doRest();
                return runSubMenuOptions();
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return runSubMenuOptions();
        }
    }

    public boolean runSubMenuOptions1() {
        System.out.println(Messages.CONVERT);
        int suboption = read.getInt();
        switch (suboption) {
            case 0:
                System.out.println("Return");
                return true;
            case 1:
                System.out.println("Fahrenheit to Celsius");
                doFahrenheittoCelsius();
                return runSubMenuOptions1();
            case 2:
                System.out.println("Celsius to Fahrenheit");
                doCelsiustoFahrenheit();
                return runSubMenuOptions1();
            case 3:
                System.out.println("Convert Inch to Meters");
                doInchtoMeters();
                return runSubMenuOptions1();
            case 4:
                System.out.println("Convert Meters to Inch ");
                doMeterstoInch();
                return runSubMenuOptions1();
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return runSubMenuOptions1();
        }
    }
}


