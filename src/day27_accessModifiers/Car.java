package day27_accessModifiers;

public class Car { //outer class

    public String make, model, color;
    public int year;
    public double price;
    public static int wheels = 4;

    public class CarEngine { //inner class

        public void method () {
            System.out.println(year);
            System.out.println(price);
            System.out.println(wheels);
        }

    }

    public static class StaticInnerClass {
        public void method () {
            wheels = 5;
            //price = 444;
        }

    }
}
