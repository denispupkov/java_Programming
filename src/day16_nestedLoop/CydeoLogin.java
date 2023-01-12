package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        }
        else {
            for (int i = 0; i < 3; i++) {
                if (i!=2) {
                    System.err.println("Incorrect username or password, please re-enter");
                }
                else {
                    System.err.println("This is your last attempt. Please re-enter your username and password");
                }
                System.out.println("Enter your username");
                u = scan.next();
                System.out.println("Enter your password");
                p = scan.next();
                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("You are logged in");
                    break;
                }

            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.err.println("Your account now is locked. Please contact with support team");
            }
        }


    }
}
