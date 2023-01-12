package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter the number");
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println(sum);

        int max = 0;
        int num = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter 5 random numbers");
            num = scan.nextInt();
            if (num > max) {
                max = num;
            }


        }
        System.out.println("max = " + max);


        int min = Integer.MAX_VALUE;
        int number = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter 5 random numbers");
            number = scan.nextInt();
            if (number < min) {
                min = number;
            }
        }
        System.out.println("min = " + min);
    }
}
