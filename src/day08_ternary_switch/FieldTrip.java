package day08_ternary_switch;

public class FieldTrip {

    public static void main(String[] args) {

        int gradeNumber = 7;
        String location = "Unknown";
        int numberOfGroups = 0;
        String teacherInCharge = "Unknown";

        if (gradeNumber>0 && gradeNumber<7) {
            if (gradeNumber == 1) {
                location="Apple Orchard";
                numberOfGroups = 3;
                teacherInCharge = "Mr. Smith";
            }
            else if (gradeNumber == 2){
                location ="Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr. Lee";
            }
            else if (gradeNumber == 3){
                location ="Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Mr. Wilson";
            }
            else if (gradeNumber == 4){
                location ="Movie Theater";
                numberOfGroups = 2;
                teacherInCharge = "Mr. Reyes";
            }
            else if (gradeNumber == 5){
                location ="Museum";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Lela";
            }
            else {
                location ="Six Flags";
                numberOfGroups = 8;
                teacherInCharge = "Mr. Watt";
            }


        }
        System.out.println("Location - "+location);
        System.out.println("Number of groups - "+numberOfGroups);
        System.out.println("Teacher in charge - "+teacherInCharge);


    }
}
