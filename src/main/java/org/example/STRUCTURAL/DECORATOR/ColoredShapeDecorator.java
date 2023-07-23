package org.example.STRUCTURAL.DECORATOR;

public class ColoredShapeDecorator extends ShapeDecorator{
    public ColoredShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        super.draw();
        setColor(shapeDecorator);
    }

    void setColor(Shape decoratedShape) {
        System.out.println(decoratedShape + " is colored now");
    }
}

