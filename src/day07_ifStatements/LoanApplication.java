package day07_ifStatements;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 30000;
        int creditScore = 800;
        String result = "";

        if (salary >=45000 && creditScore>=700) {
            result = "You are eligible for the loan";
        }
        else {
            result = "You are NOT eligible for the loan";
        }
        System.out.println(result);
    }
}
