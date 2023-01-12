package day34_abstraction.carTask;

public class Honda extends Car {

    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start "+getMake()+" "+getModel());
    }

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
}
