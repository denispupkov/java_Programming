package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("John",28,'M',"Java Developer",
                120000, LocalDate.of(2022,12,2));

        System.out.println(e1);


    }
}
