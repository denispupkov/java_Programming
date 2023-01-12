package day13_customMethods;



public class WarmupTasks {

    public static void main(String[] args) {

calculate(1,100,'-');
ageGroup(-1);

    }

    public static void calculate (double num1, double num2, char mathOperator) {

        double result = 0;
        if (mathOperator=='+') {
            result = num1+num2;
        }
        else if (mathOperator=='-') {
            result = num1-num2;
        }
        else if (mathOperator=='/') {
            result = num1/num2;
        }
        else if (mathOperator=='*') {
            result = num1*num2;
        }
        else {
            System.out.println("Wrong Math Operator");
        }
        System.out.println(result);
    }
public static void ageGroup (int age) {
        if (age<21 && age>=0) {
            System.out.println("Teenager");
        }
        else if (age>=21 && age<55) {
            System.out.println("Adult");
        }
        else if (age>=55) {
            System.out.println("Senior");
        }
        else {
            System.out.println("Wrong age");
        }
}

}
