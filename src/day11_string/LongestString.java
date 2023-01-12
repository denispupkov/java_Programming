package day11_string;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first String");
        String str1 = scan.nextLine();
        System.out.println("Enter second String");
        String str2 = scan.nextLine();

        if (str1.length()>str2.length()) {
            System.out.println(str1+" is the longest String");
        }
        else if (str2.length()>str1.length()) {
            System.out.println(str2+" is the longest String");
        }
        else {
            System.out.println("Strings are equal");
        }
        scan.close();
    }
}
