package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor () {
        System.out.println("Constructor"); //executes while the object is created
    }


    {
        System.out.println("Instance Block"); //executes before constructor
        // as many times as object created
    }


    static {
        System.out.println("Static Block"); // executes only ones and it does not depend on object
    }


    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();
        new StaticBlock_vs_InstanceBlock_vs_Constructor();


    }
}
