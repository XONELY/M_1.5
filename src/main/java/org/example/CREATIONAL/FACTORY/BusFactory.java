package org.example.CREATIONAL.FACTORY;

public class BusFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }
}
