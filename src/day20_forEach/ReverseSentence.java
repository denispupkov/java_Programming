package day20_forEach;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String str = "I love Java";

        String [] strArray = str.split(" ");
        String [] reversed = new String[strArray.length];
        for (int i = strArray.length-1, j = 0; i >= 0; i--, j++) {

            reversed[j] = strArray[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
