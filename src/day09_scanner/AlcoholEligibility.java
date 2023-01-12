package day09_scanner;

import java.util.Scanner;

public class AlcoholEligibility {

    public static void main(String[] args) {

        int age = 0;
        String result = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");

        age = scan.nextInt();

        if (age>0 && age <126) {
            if (age>21) {
                result = "You are eligible";
            }
            else {
                result = "You are not eligible";
            }
        }
        else {
            result = "Wrong age. Enter between 1 and 125";
        }
        System.out.println(result);
    }
}
