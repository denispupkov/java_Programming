package day26_statics.studentTask;

import java.util.Arrays;

public class TestObjects {

    public static void main(String[] args) {

    Student student1 = new Student("Yusuf",21,'M',"A16");
        Student student2 = new Student("Glenio",24,'M',"B34");
        Student student3 = new Student("Sumeyye",22,'F',"C56");
        Student student4 = new Student("Mehmet",25,'M',"D43");
        Student student5 = new Student("Sebastian",23,'M',"E27");

        Student [] students = {student1,student2,student3,student4,student5};

        StudentsGroup group1 = new StudentsGroup("Java Turtles",1);
        group1.addStudent(students);

        System.out.println(group1);

        group1.addStudent("Khashavar",34,'M',"F35");

        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name+" : "+each.id);
        }

        StudentsGroup group2 = new StudentsGroup("Python Turtles",2);
        StudentsGroup group3 = new StudentsGroup("Selenium Turtles",3);
        StudentsGroup group4 = new StudentsGroup("SQL Turtles",4);
        group2.addStudent(students);
        group3.addStudent(students);
        group4.addStudent(students);

        StudentsGroup [] groups = {group1,group2,group3,group4};

        System.out.println(Arrays.asList(groups));


    }
}
