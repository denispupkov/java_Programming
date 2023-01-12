package day19_Array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("How many numbers do you want to enter?");
        int numberOfNumbers = scanner.nextInt();


        int [] yourPick = new int[numberOfNumbers];

        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Now pick your "+numberOfNumbers+" numbers one by one");
            yourPick[i] = scanner.nextInt();

        }
        System.out.println("Your chosen numbers are "+Arrays.toString(yourPick));
        System.out.println("Your average number is: "+Arrays.stream(yourPick).average());
    }
}
