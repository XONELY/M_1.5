package org.example.STRUCTURAL.DECORATOR;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
