package day32_finalKeyword.carTask_methodOverriding;

import java.util.Arrays;

public final class Tesla extends Car {

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autoPilot() {
        System.out.println(getMake() + " " + getModel() + " is in self-driving mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + getMake() + " " + getModel());
    }

    @Override
    public void setModel(String model) {
        String[] models = {"Model S", "Model Y", "Model X", "Model 3"};
        if (!Arrays.asList(models).contains(model)) {

            System.err.println("The Tesla model " + model + " is incorrect");
            System.exit(1);
        }

        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
        String[] colors = {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"};

        if (!Arrays.asList(colors).contains(color)) {
            System.err.println("The Tesla color " + color + " is invalid");
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if (year<2008) {
            System.err.println("The Tesla year " + year + " is invalid");
            System.exit(1);
        }
        super.setYear(year);
    }


    @Override
    public void setPrice(double price) {
        if (price<50000) {
            System.err.println("The Tesla price " + price + " is invalid");
            System.exit(1);
        }
        super.setPrice(price);
    }
}