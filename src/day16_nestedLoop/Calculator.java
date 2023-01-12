package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number");
            double num1 = scan.nextDouble();

            System.out.println("Enter math operator");
            char mathOperator = scan.next().charAt(0);

            while (!(mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/')) {
                System.out.println("Wrong operator. Try one more time");
                mathOperator = scan.next().charAt(0);
            }
            System.out.println("Enter the second number");
            double num2 = scan.nextDouble();

            double result = (mathOperator == '+') ? num1 + num2 : (mathOperator == '-') ? num1 - num2 : (mathOperator == '*')
                    ? num1 * num2 : num1 / num2;

            System.out.println(num1+" "+mathOperator+" "+num2+" = "+result);

            System.out.println("would you like to continue? yes/no");
            String str = scan.next();
            while (!((str.equalsIgnoreCase("yes")) ||
                    (str.equalsIgnoreCase("no")))) {
                System.out.println("Wrong Answer. Try one more time");
                str = scan.next();
            }
            if (str.equalsIgnoreCase("no")){
                break;
            }


        }


    }
}
