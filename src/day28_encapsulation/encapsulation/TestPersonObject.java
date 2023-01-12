package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Man",'F',
                LocalDate.of(1902,11,2));

        System.out.println(person1);





    }
}
