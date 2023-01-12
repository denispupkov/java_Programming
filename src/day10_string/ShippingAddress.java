package day10_string;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Enter your building number");
        String buildingNumber = scan.next();
        scan.nextLine();
        System.out.println("Enter your street name");
        String streetName = scan.nextLine();
        System.out.println("Enter your city name");
        String cityName = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zip");
        String zip = scan.next();

        System.out.println("Your shipping address is:\n\t"+fullName+"\n\t"+buildingNumber+" "+streetName
        +"\n\t"+cityName+", "+state+" "+zip);

        scan.close();



    }
}
