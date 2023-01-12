package day27_accessModifiers;

//import static day27_accessModifiers.StaticInitializationBlock.*;
public class Test {

    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("______________");

        System.out.println(AccessModifiers.publicDate);
        System.out.println(AccessModifiers.protectedData);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateData);




    }
}
