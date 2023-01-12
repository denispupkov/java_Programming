package day20_forEach;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char [] ch = str.toCharArray();//convert String to char array
        System.out.println(Arrays.toString(ch));

        System.out.println("___________________");

        String str2 = "Today is a great day to learn Java";

        String [] splitted = str2.split(" ");

        System.out.println(Arrays.toString(splitted));

    }
}
