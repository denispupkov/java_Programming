package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");

        String str = scan.nextLine();

        if (str.charAt(0)>=48 && str.charAt(0)<=57) {
            System.out.println("First Character is digit");
        }
        else if (str.charAt(0)>=65 && str.charAt(0)<=90) {
            System.out.println("First character is upper case letter");
        }
        else if (str.charAt(0)>=97 && str.charAt(0)<=122) {
            System.out.println("First character is lower case letter");
        }
        else if (str.charAt(0)>=33 && str.charAt(0)<=47){
            System.out.println("First character is special character");
        }


    }
}
