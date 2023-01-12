package day07_ifStatements;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        int age = 32;

        if (age >= 21) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not eligible");
        }
    /*-----------------------*/

        int day = 2;

        if (day==1) System.out.println("Monday");
        if (day==2) System.out.println("Tuesday");
        if (day==3) System.out.println("Wednesday");
        if (day==4) System.out.println("Thursday");
        if (day==5) System.out.println("Friday");
        if (day==6) System.out.println("Saturday");
        if (day==7) System.out.println("Sunday");


    }
}
