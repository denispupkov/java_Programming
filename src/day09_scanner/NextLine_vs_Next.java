package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = scan.nextInt();

        scan.nextLine(); //clears Enter key

        System.out.println("Enter your full name");

        String full_name = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);


    }
}
