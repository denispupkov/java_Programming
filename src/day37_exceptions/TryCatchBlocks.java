package day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {
            System.out.println(9/0);
            System.out.println("Try Block");
        }
        catch (ArithmeticException a) {
            System.out.println("Catch Block");
        }


        System.out.println("Program ended");

    }
}
