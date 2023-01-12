package day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition = false;

        for (; condition ;) {
            System.out.println("for loop -- Hello Cydeo"); //it checks the condition first
        }
        while (condition) {
            System.out.println("while loop -----Hello Cydeo"); //it checks the condition first
        }

        do {
            System.out.println("do-while loop......Hello Cydeo");//it executes the code first
        }
        while (condition);

    }
}
