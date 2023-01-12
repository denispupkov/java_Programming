package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < 6; i++) {

            System.out.println("Enter number "+i);
            number = scan.nextInt();
            if (number < min) {
                min = number;
            }
        }
        System.out.println("min = " + min);
    }
}
