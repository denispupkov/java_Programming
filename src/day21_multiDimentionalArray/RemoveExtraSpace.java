package day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {

    public static void main(String[] args) {

        String str = "   Hello world         I        love          Java    ";
        str = str.trim();

        String [] splitted = str.split(" ");

        System.out.println(Arrays.toString(splitted));

        str = "";

        for (String each : splitted) {
            if (!each.isEmpty()) {
            str+=each+" ";
            }

        }
        str= str.trim();
        System.out.println(str);




    }
}
