package day13_customMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {
        System.out.println(isOdd(24));
        System.out.println(isEven(24));
        System.out.println(max(11,1));
        System.out.println(min(15,2));

    }

    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int max (int num1, int num2) {
        int result=0;
        if (num1>num2) {
            result =  num1;
        } else if (num2>num1) {
            result = num2;
        }
        else {
            System.out.println("the numbers are equal");
        }
return result;
    }
    public static int min (int num1, int num2) {
        int result=0;
        if (num1<num2) {
            result =  num1;
        } else if (num2<num1) {
            result = num2;
        }
        else {
            System.out.println("the numbers are equal");
        }
        return result;
    }
}
