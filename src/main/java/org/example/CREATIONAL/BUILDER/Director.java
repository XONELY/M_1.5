package org.example.CREATIONAL.BUILDER;

public class Director {

    ComputerBuilder builder;


    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    Computer build() {
        builder.createComputer();
        builder.buildName();
        builder.buildCpu();
        builder.buildRam();
        builder.buildHdd();
        builder.buildGpu();

        Computer computer = builder.getComputer();

        return computer;
    }
}
