package day26_statics;

public class TestIphoneObject {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone 14","Silver",1299.99);

        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
        System.out.println(iPhone.model);

        iPhone.printPhoneInfo();

        System.out.println(iPhone.brand); // bad practice to call instance variable through the object
        System.out.println(iPhone.OS); // bad practice to call instance variable through the object
        iPhone.printOperatingSystem(); // bad practice to call instance variable through the object



    }

}
