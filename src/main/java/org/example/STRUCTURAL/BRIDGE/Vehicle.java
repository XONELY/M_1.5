package org.example.STRUCTURAL.BRIDGE;

public abstract class Vehicle {
    protected Engine engine;
    protected Vehicle(Engine engine) {
        this.engine = engine;
    }
    abstract void drive();
    abstract void park();
}
