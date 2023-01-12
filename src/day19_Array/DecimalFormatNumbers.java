package day19_Array;

import java.text.DecimalFormat;

public class DecimalFormatNumbers {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.000");

        double n1 = 10.587654;

        System.out.println(df.format(n1));
    }
}
