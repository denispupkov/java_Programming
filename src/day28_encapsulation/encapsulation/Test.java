package day28_encapsulation.encapsulation;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();

        student.setAge(44);
        System.out.println(student.getAge());
        System.out.println("Test Completed");

        student.setName("Tom");
        System.out.println(student.getName());

        student.setName("Mike");
        System.out.println(student.getName());


    }
}
