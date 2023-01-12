package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {


        int j = 0;
        int [] array = {1,2,3,4,5};
        int [] reverseArray = new int[array.length];

        System.out.println("Reversed array "+Arrays.toString(ArraysUtility.reverse(array)));

        for (int i = array.length-1; i >= 0; i--, j++) {

            reverseArray[j] = array[i];
            }

        System.out.println(Arrays.toString(reverseArray));
        }



    }

