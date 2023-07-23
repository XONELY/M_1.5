package org.example.STRUCTURAL.BRIDGE;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("ElectricEngine start");
    }
    @Override
    public void stop() {
        System.out.println("ElectricEngine stop");
    }
}
