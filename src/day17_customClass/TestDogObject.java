package day17_customClass;

public class TestDogObject {

    public static void main(String[] args) {

    Dog dog1 = new Dog();

    dog1.name = "Max";
    dog1.breed = "Husky";
    dog1.gender = 'M';
    dog1. age = 4;
    dog1.size = "Large";
    dog1.color = "Gray";

    dog1.eat();
        System.out.println(dog1);

        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Loki","Chow Chow",'M',3,"Medium","Black");

        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setInfo("Chuck","bulldog",'M',5,"Small","White");
        System.out.println(dog4);
        dog3.eat();
        dog4.drink();

    }


}
