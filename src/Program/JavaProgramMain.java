package Program;

import java.util.HashMap;

public class JavaProgramMain {

    public static void main(String[] args) {
        ProgramStart ps = new ProgramStart();
        Login login = new Login();
        HashMap hashMap = new HashMap();
        if (login.loginSuccessful()) {
            ps.runProgram();
        }
    }
}
