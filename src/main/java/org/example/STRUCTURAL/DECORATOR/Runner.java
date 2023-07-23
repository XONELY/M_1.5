package org.example.STRUCTURAL.DECORATOR;

public class Runner {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape coloredCircle = new ColoredShapeDecorator(new Circle());
        circle.draw();
        coloredCircle.draw();
    }
}
