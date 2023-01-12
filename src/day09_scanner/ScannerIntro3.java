package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);
        System.out.println("You have entered "+ch);

        System.out.println("Would you like to continue?");
        String answer = scan.next();

        System.out.println("You have entered: "+answer);

        scan.close();

    }
}
