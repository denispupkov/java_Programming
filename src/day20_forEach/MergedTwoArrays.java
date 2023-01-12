package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergedTwoArrays {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7};
        int [] arr3 = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr3.length; i++) {

            if (arr1.length > i) {
                arr3[i]=arr1[i];
            }
            else if (arr1.length-1 < i) {
                arr3[i]=arr2[i-arr1.length];
            }
        }
        System.out.println(Arrays.toString(arr3));

    int [] a1 = {10,20,30,40,50,60};
    int [] a2 = {70,80,90};

    double [] b1 = {10.5, 5.5, 3.5, 6.5, 8.5};
    double [] b2 = {20.5, 15.5, 13.5};

    char [] ch1 = {'A', 'B','c','D','e'};
    char [] ch2 = {'X','Y','Z'};

        System.out.println(Arrays.toString(ArraysUtility.merge(a1,a2)));
        System.out.println(Arrays.toString(ArraysUtility.merge(b1,b2)));
        System.out.println(Arrays.toString(ArraysUtility.merge(ch1,ch2)));
    }
}
