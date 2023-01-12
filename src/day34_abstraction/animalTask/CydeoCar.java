package day34_abstraction.animalTask;

import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Car;
import day35_polymorphism.transportationTask.Electric;

public class CydeoCar extends Car implements Flyable, Electric, AutoPilot, Swimmable {

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void swim() {

    }
}
