package day27_accessModifiers;

public class AccessModifiers {

    public static int publicDate = 200;
    protected static int protectedData = 300;

    static int defaultData = 400;

    private static int privateData = 500;




    public static void main(String[] args) {
        System.out.println(publicDate);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);


    }
}
