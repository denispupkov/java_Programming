package day09_scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 15;

        String result = "";

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: //1st way declaring set of cases
                result = "31 days";
                break;

            case 2:
                result = "28 days";
                break;

            case 4: //second way declaring set of cases
            case 6:
            case 9:
            case 11:
                result = "30 days";


            default:
                result = "Invalid Number";

        }


    }

}
