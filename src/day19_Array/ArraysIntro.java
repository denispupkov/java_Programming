package day19_Array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int [] scores = {1,2,3};
        int [] scores2 = new int[5];

        System.out.println(scores2);//got result as hashcode
        System.out.println(Arrays.toString(scores2));
    }
}
