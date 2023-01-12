package day22_arrayList;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int [] numbers = {10,20,30,30,50,60,70,90,100,100,120, 10};

        System.out.println(ArraysUtility.contains(numbers,90));

        String [] students = {"Sumeye","Hamza","Marika"};

        System.out.println(ArraysUtility.contains(students,"Hamza"));

        System.out.println(Arrays.toString(ArraysUtility.remove(numbers,5)));

        System.out.println(Arrays.toString(ArraysUtility.removeDup(numbers)));

    }
}
