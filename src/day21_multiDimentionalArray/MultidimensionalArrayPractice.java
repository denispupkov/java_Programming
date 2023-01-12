package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultidimensionalArrayPractice {

    public static void main(String[] args) {

        String [] group1 = {"Sa","Fa","Ga", "Ma"};
        String [] group2 = {"Be", "Le","Pe"};
        String [] group3 = {"Ni","Wi","Li","Di","Fi"};
        String [] group4 = {"So","Bo"};

        String [][] groups = {group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {

                System.out.println(groups[i][j]);
            }

        }
        System.out.println("____________________");
        for (int i = groups.length - 1; i >= 0; i--) {
            for (String each : groups[i]) {
                System.out.println(each);
            }
        }


    }
}
