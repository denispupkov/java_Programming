package day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 158;

        boolean isEven = number%2==0;

        if (isEven) {
            System.out.println("Even Number");
        }

        if (!isEven) {
            System.out.println("Odd Number");
        }



    }
}
