package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int [] score = {70,100,80,90,65};

        Arrays.toString(score);

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};

        System.out.println(arr1.equals(arr2)); //wrong way to compare arrays
        System.out.println(Arrays.equals(arr1,arr2)); //right way to compare

        int [] num = {10,56,54,71,6,105,99,11,91};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("_____________________");

        int [] arr = {10,20,30,40,50,60,70};
        int [] copyOfArray = Arrays.copyOf(arr,4);
        int [] copyOfRange = Arrays.copyOfRange(arr,2,4);
        System.out.println(Arrays.toString(copyOfArray));
        System.out.println(Arrays.toString(copyOfRange));

    }
}
