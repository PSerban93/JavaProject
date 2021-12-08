package Program;

import java.util.HashMap;
import java.util.Scanner;

public class Login {
    //Username_Passwords username_passwords = new Username_Passwords();

    public void login() {
        HashMap<String, String> login = new HashMap<String, String>();

        login.put("Serban", "321456Psc");
        login.put("Andrei", "123456A");
        login.put("Ana", "32114A");
        login.put("Ares", "147852A");
    }
    protected HashMap getlogin(){
        return getlogin();
    }
    public boolean isLoggedIn(){
        Scanner scan = new Scanner(System.in);
        String username = "Serban";
        String password =  "321456Psc";
        System.out.println(Messages.USERNAME);
        String givenUsername = scan.next();
        System.out.println(Messages.PASSWORD);
        String givenPassword = scan.next();


        if (username.equals(givenUsername) && password.equals(givenPassword)){
            System.out.println(Messages.SUCCESS);
            return true;
        }else {
            System.out.println(Messages.NOT_SUCCESS);
            return false;
    }
}
    public boolean loginSuccessful(){
        boolean repeat;
        int count = 0;
        do{
            repeat = isLoggedIn();
            count++;
        }while (!repeat && count <=2);
        return repeat;
    }
}
