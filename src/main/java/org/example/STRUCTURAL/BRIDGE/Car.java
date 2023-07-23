package org.example.STRUCTURAL.BRIDGE;

public class Car extends Vehicle {
    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving.");
    }

    @Override
    public void park() {
        engine.stop();
        System.out.println("Parked.");
    }
}
