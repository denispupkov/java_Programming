package day14_forLoop;

public class OverloadingTheMainMethod {

    public static void main(String[] args) {

        System.out.println("A");
        main(2);
        main(3.5);
        main(false);
    }

    public static void main(int args) {

        System.out.println("B");
    }

    public static void main(double args) {

        System.out.println("C");
    }

    public static void main(boolean args) {

        System.out.println("D");
    }
}
