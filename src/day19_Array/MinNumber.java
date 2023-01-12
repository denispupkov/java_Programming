package day19_Array;

public class MinNumber {

    public static void main(String[] args) {


        int [] numbers = {100,20,500,40,-10,30};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
