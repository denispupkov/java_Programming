package day31_inheritance.animal_methodOverriding;

public class TestAnimalObject {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily","Bengal","Small","Gray",'F',4);
        Dog dog = new Dog("Max","Huskey","Large","White",'M',3);
        Lion lion = new Lion("Simba","African Lion","Large","Yellow",'M',6,true);
        Eagle eagle = new Eagle("Bella","American Eagle","Medium","Black and White",'F',4);


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("______________");
        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("_________________");
        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();

    }

}
