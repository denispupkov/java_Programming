package day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100) { //pre-condition

            if (score >= 60) { //second condition
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }

        System.out.println("-----------------");

    }
}