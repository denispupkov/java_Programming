package day09_scanner;

import java.util.Scanner;

public class OddOrEvenNumber {

    public static void main(String[] args) {

        int num = 0;
        String result = "Invalid Number. Please enter number between 1 and 1000";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scan.nextInt();


        if (num > 0 && num < 1001) {
            if (num % 2 == 0) {
                result = "The number " + num + " is even";
            } else {
                result = "The number " + num + " is odd";
            }

        }
        System.out.println(result);
    }
}
