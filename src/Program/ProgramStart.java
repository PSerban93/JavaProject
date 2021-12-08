package Program;

public class ProgramStart extends MenuOptions {
    ReadFromKeyboard read = new ReadFromKeyboard();
    Submenu sb = new Submenu();

    public void printSalute() {
        System.out.println(Messages.SALUTE);
    }

    public void printMenu() {
        System.out.println(Messages.MENU);
    }


    public boolean runMenuOption() {

        printMenu();
        int option = read.getInt();
        switch (option) {
            case 0:
                System.out.println(Messages.SEE_SOON);
                return false;
            case 1://Operatii Matematice
                return sb.runSubMenuOptions();
            case 2://Convertor
                return sb.runSubMenuOptions1();
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public void runProgram() {
        printSalute();
        boolean repeatProgram;
        do {
            repeatProgram = runMenuOption();
        } while (repeatProgram);
    }
}
