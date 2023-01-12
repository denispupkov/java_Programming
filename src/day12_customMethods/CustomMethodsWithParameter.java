package day12_customMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {


        oddOrEven(33);
        oddOrEven(10000);
        isEligibleToBuyAlcohol(22);
        isEligibleToBuyAlcohol(1);
        isOddOrEvenOrZero(0);
        studentsGrade(64);
        initials("Denis Wagner");

    }

    public static void oddOrEven (int num) {
        if (num%2==0) {
            System.out.println("The number "+num+" is even");
        }
        else {
            System.out.println("The number "+num+" is odd");
        }

    }

    public static void isEligibleToBuyAlcohol (int age) {
        if (age>=21) {
            System.out.println("The person of "+age+" years old is eligible to buy alcohol");
        }
        else {
            System.out.println("The person of "+age+" years old is NOT eligible to buy alcohol");
        }
    }

    public static void isOddOrEvenOrZero (int num) {

        if (num%2==0 && num!=0) {
            System.out.println("The number "+num+" is even");
        }
        else if (num%2==1 && num!=0){
            System.out.println("The number "+num+" is odd");
        }
        else if (num==0){
            System.out.println("The number "+num+" is zero");
        }
        else {
            System.out.println("Try another number");
        }
    }

    public static void studentsGrade (int score) {

        if (score>91) {
            System.out.println("Grade A");
        }
        else if (score<=91 && score>=82) {
            System.out.println("Grade B");
        }
        else if (score<=81 && score>=72) {
            System.out.println("Grade C");
        }
        else if (score<=71 && score>=65) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }

    }

    public static void initials (String fullName) {

        System.out.println("The first Name Initial is "+fullName.charAt(0));
        System.out.println("The last name Initial is "+fullName.substring(fullName.indexOf(" ")+1).charAt(0));
    }
}
