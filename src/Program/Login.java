package Program;

import java.util.Scanner;

public class Login {


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
