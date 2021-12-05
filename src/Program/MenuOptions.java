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
    public void doScadere(){
        int Nr1 = read.getInt();
        int Nr2 = read.getInt();
        System.out.println("Scaderea este: "+
                calc.scadere(Nr1, Nr2));

    }
    public void doInmultire(){
        int Nr1 = read.getInt();
        int Nr2 = read.getInt();
        System.out.println("Rez. Inmultirii este: "+
                calc.inmultire(Nr1, Nr2));
    }
    public void doImpartire(){
        int Nr1 = read.getInt();
        int Nr2 = read.getInt();
        System.out.println("Rez. Impartirii este: "+
                calc.divide(Nr1, Nr2));
    }
    public void doMedia(){
        double a = read.getDouble();
        double b = read.getDouble();
        double c = read.getDouble();
        System.out.println("Media este: "+
                calc.media(a, b, c));
    }
    public void doRest(){
        int Nr1 = read.getInt();
        int Nr2 = read.getInt();
        System.out.println("Restul este: "+
                calc.rest(Nr1, Nr2));
    }
}
