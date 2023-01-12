package day15_whileLoop;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sequence of randomly repeating characters");
        String str = scan.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(str.charAt(i)+"")) {
                result+=str.charAt(i)+"";
            }
        }
        System.out.println(result);


    }
}
