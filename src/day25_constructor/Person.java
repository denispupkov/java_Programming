package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    public void eat(String food) {
        System.out.println("I am eating "+food);
    }

    public void sleeping() {
        System.out.println("I am sleeping");
    }

    public void drink(String drink) {
        System.out.println("I am drinking "+drink);
    }
    public Person(String name, int age, char gender, LocalDate dateOfBirth,boolean isMarried, boolean isEmployed){
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
            this.isMarried = isMarried;
            this.isEmployed = isEmployed;
        }


        public String toString () {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MMMM dd, YYYY")) +
                    ", isMarried=" + isMarried +
                    ", isEmployed=" + isEmployed +
                    '}';
        }
    }

