package day29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',4,"Large","White");
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Felicia","stray",'F',3,"Medium","Black and White");
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',5,"Large","Orange");
        System.out.println(tiger);

        System.out.println("__________________________________");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        System.out.println("__________________________________");

        dog.bark();
        cat.meow();
        tiger.hunt();

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);




    }


}
