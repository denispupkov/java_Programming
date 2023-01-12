package day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        System.out.println(sentence.replace("Python","Java"));

        String sentence4 = "I love Java Programming";

        System.out.println(sentence4.substring(7,11));

        String today = "Today is Sunday, Tomorrow is Monday";

        System.out.println(today.substring(today.indexOf("S"),today.indexOf(", ")));

        String email = "CydeoSchoolJavaProgramming@yahoo.com";
        System.out.println(email.substring(email.indexOf("ya"),email.indexOf(".")));




    }
}
