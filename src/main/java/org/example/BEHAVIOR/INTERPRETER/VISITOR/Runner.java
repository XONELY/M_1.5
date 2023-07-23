package org.example.BEHAVIOR.INTERPRETER.VISITOR;

public class Runner {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.6),
                new Square(3.3),
                new Circle(1.3)
        };

        AreaCalculatorVisitor areaVisitor = new AreaCalculatorVisitor();
        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
        }

        System.out.println("Area of all shapes: " + areaVisitor.getTotalArea());
    }
}
