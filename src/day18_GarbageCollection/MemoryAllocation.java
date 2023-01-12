package day18_GarbageCollection;

class Car {
    public String color;
    public String model;
    public String brand;



}
public class MemoryAllocation {

    public static void main(String[] args) {

int a = 100; //stack

        Car car = new Car();
        // stack     heap

    }

    public static void method1() {
        int b = 200; //stack

    }
    public static void method2() {

        String c = "Hello World";
        // local variable c goes to stack, "Hello World" object goes to Heap (String Pool)

        String d = new String("Hello World");
        // local variable c goes to stack, "Hello World" object goes to Heap (outside of String Pool)

    }

}
