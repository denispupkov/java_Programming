package day15_whileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        double num1 = scan.nextDouble();

        System.out.println("Enter your second number");
        double num2 = scan.nextDouble();

        System.out.println("Enter your math operator");
        char mathOperator = scan.next().charAt(0);

        while (!(mathOperator=='+' || mathOperator == '-' ||
                mathOperator == '*' || mathOperator == '/')) {
            System.err.println("Wrong math Operator. Please re-enter");
            System.err.println("Enter your math operator");
            mathOperator = scan.next().charAt(0);

        }

        double result = (mathOperator=='*')?num1*num2:(mathOperator=='/')?
                num1/num2:(mathOperator=='+')?num1+num2:num1-num2;
        System.out.println(result);
    }
}
