package day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java";
        String result = "";

        for (int i = str.length()-1; i >=0; i--) {

            result+=str.charAt(i);
        }
        System.out.println(result);

        reverseString("I love Java");
    }

    public static String reverseString (String str) {

        String result = "";

        for (int i = str.length()-1; i >=0; i--) {

            result+=str.charAt(i);
        }
        System.out.println(result);

        return result;
    }
}
