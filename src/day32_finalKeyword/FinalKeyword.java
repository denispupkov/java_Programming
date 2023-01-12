package day32_finalKeyword;

import java.time.LocalDate;

public class FinalKeyword {

    public static void main(String[] args) {

        final char gender = 'M';
        System.out.println(gender);

        //gender = 'F';
        System.out.println(gender);

        System.out.println("_________________");
        final LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth);
       // dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

    }
}
