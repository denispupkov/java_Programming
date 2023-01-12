package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, y");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(dateTimeFormatter));

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17,30);
        System.out.println(time1.format(timeFormatter));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));



    }
}
