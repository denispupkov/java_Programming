package day22_arrayList;

public class MaxMinNumbersOfMultiDArray {

    public static void main(String[] args) {

        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};

        int max = array[0][0];
        int min = array[0][0];

        for (int[] eachArray : array) {
            for (int eachElement : eachArray) {

                if (max < eachElement) {
                    max = eachElement;
                }
                if (min > eachElement) {
                    min = eachElement;
                }
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
