package day10_string;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Enter your age");
        byte age = scan.nextByte();
        System.out.println("Enter your gender");
        char gender = scan.next().charAt(0);
        scan.nextLine();
        System.out.println("Enter your company name");
        String companyName = scan.nextLine();
        System.out.println("Enter your job title");
        String jobTitle = scan.nextLine();
        System.out.println("Enter your salary");
        double salary = scan.nextDouble();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);



    }
}
