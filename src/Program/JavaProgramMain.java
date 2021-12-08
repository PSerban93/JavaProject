package Program;

import java.util.HashMap;

public class JavaProgramMain {

    public static void main(String[] args) {
        ProgramStart ps = new ProgramStart();
        Submenu sb = new Submenu();
        Login login = new Login();
        HashMap hashMap = new HashMap();
        if (login.loginSuccessful()) {
            ps.runProgram();

        }
    }
}
