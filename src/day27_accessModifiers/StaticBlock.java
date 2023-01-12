package day27_accessModifiers;

public class StaticBlock {

public StaticBlock () {
    System.out.println("Constructor");
}

    public static void main(String[] args) {
        System.out.println("Main Method"); //runs second
        new StaticBlock(); //runs third
        new StaticBlock(); //runs forth
        new StaticBlock(); //runs fifth

    }

    static {

        System.out.println("Static Block"); //runs first
    }
}
