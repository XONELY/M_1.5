package org.example.CREATIONAL.BUILDER;

public class Computer {
    private String name;
    private int ram;
    private int hdd;
    private int cpu;
    private boolean gpu;

    public void setName(String name) {
        this.name = name;
    }


    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setGpu(boolean gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                '}';
    }
}
