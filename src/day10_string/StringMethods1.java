package day10_string;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "Cydeo";

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char forthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("forthChar = " + forthChar);
        System.out.println("fifthChar = " + fifthChar);

        String s1 = "Wooden Spoon";
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(s1.length()-1));




    }
}
