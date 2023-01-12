package day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        int total = addition(20,40);
        System.out.println(total);
        System.out.println(squareOfNumber(10));

    }

    public static int addition(int n1, int n2) {
        int result = n1+n2;
        return result;
    }
public static int squareOfNumber (int num) {

        num = (int)Math.pow(num,2);
        return num;
}

}
