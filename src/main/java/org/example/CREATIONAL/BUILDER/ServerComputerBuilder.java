package org.example.CREATIONAL.BUILDER;

public class ServerComputerBuilder extends ComputerBuilder {

    @Override
    void buildName() {
        super.computer.setName("Server");
    }

    @Override
    void buildRam() {
        super.computer.setRam(64);
    }

    @Override
    void buildHdd() {
super.computer.setHdd(2048);
    }

    @Override
    void buildCpu() {
super.computer.setCpu(16);
    }

    @Override
    void buildGpu() {
        super.computer.setGpu(false);
    }
}
