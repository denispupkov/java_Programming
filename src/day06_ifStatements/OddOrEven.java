package day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 25;
        int result = number % 2;

        System.out.println(number + " is an even number: " + (result == 0));
        System.out.println(number + " is an odd number: " + (result > 0));


    }
}
