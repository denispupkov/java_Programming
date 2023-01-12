package day24_dateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDay = LocalDate.of(2000,5,25);
        System.out.println(birthDay);

        int year = today.getYear();
        System.out.println(year);
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());

        System.out.println("________________________");

        System.out.println(today.plusYears(1));

        System.out.println("________________________");

        LocalDate yourBirthday = LocalDate.of(1979,10,14);
        System.out.println(yourBirthday);
        LocalDate yourBrothersBirthday = yourBirthday.minusYears(2).minusMonths(3).
                minusDays(16);
        System.out.println(yourBrothersBirthday);



    }
}
