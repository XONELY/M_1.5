package org.example.STRUCTURAL.FLYWEIGHT;

public class Brush {
    private String name;
    private Color color;


    Brush(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    void draw() {
        System.out.println("Brush " + name + " with color " + color.getColor());
    }
}
