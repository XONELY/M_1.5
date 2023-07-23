package org.example.CREATIONAL.BUILDER;

public class PersonalComputerBuilder extends ComputerBuilder {
    @Override
    void buildName() {
        super.computer.setName("Personal Computer");
    }

    @Override
    void buildRam() {
        super.computer.setRam(16);
    }

    @Override
    void buildHdd() {
        super.computer.setHdd(512);
    }

    @Override
    void buildCpu() {
        super.computer.setCpu(8);
    }

    @Override
    void buildGpu() {
        super.computer.setGpu(true);
    }
}
