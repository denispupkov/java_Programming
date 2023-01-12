package day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionArray_vs_TwoDimensionArray {

    public static void main(String[] args) {

        int [] arr1D = new int[10];

        System.out.println(Arrays.toString(arr1D));

        int [][] arr2D = new int[5][];
        arr2D[0] = arr1D;

        System.out.println(Arrays.deepToString(arr2D));

    }
}
