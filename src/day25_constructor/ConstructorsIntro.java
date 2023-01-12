package day25_constructor;

public class ConstructorsIntro {

    public ConstructorsIntro () {
        System.out.println("Object is created by using default constructor");
    }
    public ConstructorsIntro (int a) {
        System.out.println("Object is created by using int argument constructor");
    }

    public static void main(String[] args) {

        ConstructorsIntro obj1 = new ConstructorsIntro();
        ConstructorsIntro obj2 = new ConstructorsIntro(12);


    }
}
