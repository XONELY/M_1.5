package org.example.STRUCTURAL.FACADE;

public class Runner {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.getData();
        facade.saveData();
    }
}
