package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal {

    private boolean isAfricanLion;

    public Lion(String name, String breed, String size, String color, char gender, int age, boolean isAfricanLion) {
        super(name, breed, size, color, gender, age);
        setAfricanLion(isAfricanLion);
    }

    public Lion(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating deer");
    }
    public void roar() {
        System.out.println("Lion "+getName()+" is roaring");
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", African Lion =" + isAfricanLion +
                '}';
    }
}
