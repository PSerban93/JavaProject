package Program;

public class ProgramStart extends MenuOptions {
    ReadFromKeyboard read = new ReadFromKeyboard();

    public void printSalute(){
        System.out.println(Messages.SALUTE);
    }
    public void printMenu(){
        System.out.println(Messages.MENU);
    }

    public boolean runMenuOption(){

        printMenu();
        int option = read.getInt();
        switch (option){
            case 0:
                System.out.println(Messages.SEE_SOON);
                return false;
            case 1:
                doSuma();
                return true;
            case 2:
                doScadere();
                return true;
            case 3:
                doInmultire();
                return true;
            case 4:
                doImpartire();
                return true;
            case 5:
                doMedia();
                return true;
            case 6:
                doRest();
                return true;

            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public void runProgram(){
        printSalute();
        boolean repeatProgram;
        do {
            repeatProgram = runMenuOption();
        }while (repeatProgram);
    }


}