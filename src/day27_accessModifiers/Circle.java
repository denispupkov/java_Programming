package day27_accessModifiers;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcArea() {
        return radius * diameter * pi;
    }


    public double calcPerimeter () {
        return diameter*pi;
    }

    public static void printPiValue () {
        System.out.println(pi);

    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
