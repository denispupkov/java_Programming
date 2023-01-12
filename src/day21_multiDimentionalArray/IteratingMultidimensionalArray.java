package day21_multiDimentionalArray;

public class IteratingMultidimensionalArray {

    public static void main(String[] args) {

        int [][] arr2D = { {10,20,30} , {40,50,60,70,80} , {90,100}};

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {

                System.out.println(arr2D[i][j]);

            }
        }


    }
}
