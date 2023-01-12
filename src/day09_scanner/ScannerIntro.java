package day09_scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st number");
        byte b = scan.nextByte();
        System.out.println("Enter the 2nd number");
        short s = scan.nextShort();
        System.out.println("Enter the 3rd number");
        int i = scan.nextInt();
        System.out.println("Enter the 4th number");
        long l = scan.nextLong();
        System.out.println("Enter the 5th number");
        int num = (int)scan.nextLong();

        scan.close();

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("num = " + num);
    }
}
