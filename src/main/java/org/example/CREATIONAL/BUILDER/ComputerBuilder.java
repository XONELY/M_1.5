package org.example.CREATIONAL.BUILDER;

public abstract class ComputerBuilder {
    Computer computer;

    void createComputer() {
        computer = new Computer();
    }

    Computer getComputer() {
        return computer;
    }



    abstract void buildName();

    abstract void buildRam();

    abstract void buildHdd();

    abstract void buildCpu();
    abstract void buildGpu();
}
