package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();

        while (true) {
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }
            System.out.println("Would you like to enter another number? Yes/No");
            String answer = scan.next().toLowerCase();

            if (answer.equals("no")) {
            break;
            }
        }
    }
}
