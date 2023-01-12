package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person [] people = {new Person(),new Person(),new Person(),new Person(),new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Malika", 'F', LocalDate.of(1984,11,12));
        people[2].setInfo("John", 'M', LocalDate.of(1976,5,01));
        people[3].setInfo("Denise", 'F', LocalDate.of(2000,8,19));
        people[4].setInfo("Farukh", 'M', LocalDate.of(1985,4,17));

        ArrayList <Person> team = new ArrayList<>();
        team.addAll(Arrays.asList(people));

        for (Person each : team) {
            System.out.println(each.name);
            System.out.println(each.dateOfBirth);

        }

       team.removeIf(p -> p.age>35);

        System.out.println(team);

    }
}
