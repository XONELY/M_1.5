package org.example.CREATIONAL.FACTORY;
public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = createVehiclebyType("bike");
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.move();
    }

    static VehicleFactory createVehiclebyType(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new CarFactory();
        } else if (type.equalsIgnoreCase("bus")) {
            return new BusFactory();
        } else if (type.equalsIgnoreCase("bike")) {
            return new BikeFactory();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}