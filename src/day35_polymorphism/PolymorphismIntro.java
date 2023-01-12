package day35_polymorphism;

import day34_abstraction.animalTask.*;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max","Huskey",'M',4,"Small","White");

        Cat cat = new Cat("Max","Huskey",'M',4,"Small","White");

        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck =  null;

       // Dog [] animals = {dog, cat,tiger,eagle,lion,parrot,dolphin,shark,duck};
        Animal [] animals = {dog, cat,tiger,eagle,lion,parrot,dolphin,shark,duck};



    }
}
