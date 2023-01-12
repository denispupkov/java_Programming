package day04_concatination;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {

        System.out.println("32" + 1); // concat
        System.out.println( 1 + "32"); // concat
        System.out.println("13" + "2"); // concat
        System.out.println(12 + 12.5); //addition
        System.out.println("The value is " +true); //concat
    }
}
