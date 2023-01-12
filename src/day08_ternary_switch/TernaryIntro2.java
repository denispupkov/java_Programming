package day08_ternary_switch;

public class TernaryIntro2 {

    public static void main(String[] args) {

        int number = 100;
        /*
        String result = "";
        if (number > 0) {
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }*/
        String result2 = (number > 0) ? "Positive": (number < 0)? "Negative": "Zero";
        System.out.println(result2);
        System.out.println("___________________");

        int n = 7;
        String day = "";
        day = (n==1) ? "Monday":(n==2)? "Tuesday": (n==3)? "Wednesday":(n==4)?"Thursday":(n==5)?"Friday"
                :(n==6)?"Saturday":(n==7)?"Sunday":"Wrong Number";

        System.out.println(day);

        System.out.println("___________________");

        int num = 12;
        String  month = "";

        month = (num==1)?"January":(num==2)?"February":(num==3)?"March":(num==4)?"April":(num==5)?"May"
                :(num==6)?"June":(num==7)?"July":(num==8)?"August":(num==9)?"September"
                :(num==10)?"October":(num==11)?"November":"December";
        System.out.println(month);


    }
}
