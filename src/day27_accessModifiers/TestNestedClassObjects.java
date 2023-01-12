package day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); //Car object
        obj1.new CarEngine(); //First non-static class
        new Car.StaticInnerClass(); // Second static inner Class



    }

}
