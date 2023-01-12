package day31_inheritance.animal_methodOverriding;

public class Dog extends Animal {

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" is eating dog food");
    }

    @Override
    public void sleep() {
        System.out.println("Dog "+getName()+" sleeps 6 hours in a day");
    }

    public void bark() {
        System.out.println("Dog "+getName()+" is barking");
    }
}
