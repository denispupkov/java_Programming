package day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {

eligible(17);



    }

    public static void eligible (int age) {
        if (age<0 || age>150) {
            System.err.println("Invalid age: "+age);
            return; //exits the method
        }
        if (age>=21) {
            System.out.println("You are eligible to buy alcohol");
        }
        else {
            System.out.println("You are NOT eligible to buy alcohol");
        }

    }
}
