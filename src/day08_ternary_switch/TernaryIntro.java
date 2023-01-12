package day08_ternary_switch;

public class TernaryIntro {

    public static void main(String[] args) {

        int score = 85;

        String result = "";

        if (score>=60) {
            result = "Passed";
        }
        else {
            result = "Failed";
        }
        System.out.println(result);


        String str = (score>=60) ? "Passed" : "Failed";
        System.out.println(str);

        System.out.println("_________________");

        int age = 20;
        String r;

        if (age >=21) {
            r = "Eligible";
        }
        else {
            r = "Not eligible";
        }

        r = (age >= 21) ? "Eligible":"Not eligible";
        System.out.println(r);
    }
}
