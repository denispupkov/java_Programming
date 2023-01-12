package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = scan.nextLine();

        System.out.println("Enter your school name:");
        String school_name = scan.nextLine();

        System.out.println("Enter your gender");
        String gender = scan.next();

        System.out.println("Enter your age:");
        int age =  scan.nextInt();

        scan.nextLine(); //helps to skip Enter key

        System.out.println("Enter the street name");
        String streetName = scan.nextLine();



    }
}
