package day32_finalKeyword.carTask_methodOverriding;

public class Car {

    private String make;
    private String model;
    private String color;
    private int year;
    private double price;
    public static int numberOfWheels;
    public static boolean hasBattery;

    public Car(String model, String color, int year, double price) {
        setMake(getClass().getSimpleName()); //setting the class name as a make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public void start () {
        System.out.println("Press the brake and twist the key to ignition to start "+make+" "+model);
    }

    static {
        numberOfWheels = 4;
        hasBattery = true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<=0) {
            System.err.println("The year cannot be negative or zero");
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0) {
            System.err.println("The price cannot be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return make+"{" +
                " model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", numberOfWheels=" + numberOfWheels +
                ", hasBattery=" + hasBattery +
                '}';
    }
}

