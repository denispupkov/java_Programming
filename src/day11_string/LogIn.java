package day11_string;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = scan.nextLine();
        System.out.println("Enter password");
        String password = scan.nextLine();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("You are now logged in");
        }
        else {
            System.err.println("Incorrect username or password. Try again");
        }

    }
}
