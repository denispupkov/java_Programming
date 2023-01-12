package day27_accessModifiers;

public class TestCircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);
        System.out.println(circle1.calcPerimeter());

        Circle circle2 = new Circle(5);
        System.out.println(circle2);
        System.out.println(circle2.calcPerimeter());

        Circle circle3 = new Circle(7);
        System.out.println(circle3);
        System.out.println(circle3.pi); //wrong way
        System.out.println(Circle.pi); //right way



    }
}
