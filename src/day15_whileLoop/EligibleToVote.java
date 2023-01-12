package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        while (!(age>=1 && age<=120)) {
            System.err.println("The age is invalid. Please re-enter your age.");
            age = scan.nextInt();
        }
        if (age>=21) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are NOT eligible to vote");
        }
        //scan.nextLine();
        System.out.println("Are you a US citizen? Yes/No");
        String yesOrNo = scan.next().toLowerCase();

        while ( ! (yesOrNo.equals("yes") || yesOrNo.equals("no")) ) {
            System.err.println("Wrong answer. Please re-enter your answer using only Yes or No");
            yesOrNo = scan.next().toLowerCase();
        }
        if(age>=21 && yesOrNo.equals("yes")) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are NOT eligible to vote");
        }
    }
}
