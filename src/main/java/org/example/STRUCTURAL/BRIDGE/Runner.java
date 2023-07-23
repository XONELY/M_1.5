package org.example.STRUCTURAL.BRIDGE;

public class Runner {
    public static void main(String[] args) {
        Vehicle petroCar = new Car(new PetrolEngine());
        Vehicle electroCar = new Car(new ElectricEngine());
        petroCar.drive();
        electroCar.drive();
        petroCar.park();
        electroCar.park();
    }
}
