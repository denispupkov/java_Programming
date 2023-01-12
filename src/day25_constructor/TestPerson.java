package day25_constructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person("Mike",33,'M',
                LocalDate.of(1999,4,25),false,true);

        System.out.println(p1);
      p1.drink("Soda");
      p1.sleeping();
      p1.eat("Burrito");



    }
}
