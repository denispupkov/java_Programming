package day19_Array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String [] students = new String[5];

        students[0] = "Gulcin";
        students[students.length-1] = "Asyl";
        students[3] = "Abdullah";
        students[2] = "Sumeye";
        students[1] = "Kuzzat";

        System.out.println(Arrays.toString(students));

        students[1] = "Meiram";
        System.out.println(Arrays.toString(students));

        for (int i = students.length-1; i >= 0; i--) {
            System.out.println(students[i]);
        }



    }
}
