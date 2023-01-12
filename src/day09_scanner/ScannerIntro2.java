package day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first decimal number:");
        float num1 = scan.nextFloat();

        System.out.println("Enter your second decimal number:");
        double num2 = scan.nextDouble();

        System.out.println("Enter true or false:");
        boolean r = scan.nextBoolean();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("r = " + r);

        scan.close();




    }
}
