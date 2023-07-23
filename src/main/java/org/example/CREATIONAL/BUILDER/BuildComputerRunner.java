package org.example.CREATIONAL.BUILDER;

public class BuildComputerRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new PersonalComputerBuilder());
        Computer computer = director.build();
        System.out.println(computer);
    }
}
