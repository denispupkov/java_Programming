package day25_constructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyOwnDateTime {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");

        System.out.println(localDateTime.format(dtf));

    }
}
