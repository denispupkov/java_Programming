package day19_Array;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        int [] arr1 = new int[100];
        int [] arr2 = new int [100];
        int [] arr3 = new int [100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=i+1;
        }

        for (int j = 0; j < arr2.length ; j++) {
           arr2[j] = arr2.length-j;
        }

        for (int i = 0, j = 1; i < arr1.length ; i++, j+=10) { //for loop with 2 variables
            arr1[i]=j;

        }
        for (int k = arr2.length - 1; k > 0; k--) {
            arr3[arr3.length-k-1]=k+1;
        }


        System.out.println("arr1 "+ Arrays.toString(arr1));
        System.out.println("arr2 "+Arrays.toString(arr2));
        System.out.println("arr3 "+Arrays.toString(arr3));


    }
}
