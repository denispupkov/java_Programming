package day18_GarbageCollection;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1 = "Java"; //eligible for garbage collection
        s1 = null;
        System.out.println(s1);

        System.out.println(s1.toUpperCase()); // gives nullPointerException
        // because there is no reference to the object

        System.out.println("------------------------------------------------");





    }
}
