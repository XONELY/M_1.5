package org.example.STRUCTURAL.DECORATOR;

public class ShapeDecorator implements Shape {
    protected Shape shapeDecorator;

    @Override
    public void draw() {
        shapeDecorator.draw();
    }

    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }
}
