package org.example.BEHAVIOR.INTERPRETER.VISITOR;

class AreaCalculatorVisitor implements ShapeVisitor {
    private double totalArea;

    public double getTotalArea() {
        return totalArea;
    }

    @Override
    public void visitCircle(Circle circle) {
        totalArea += Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visitSquare(Square square) {
        totalArea += square.getSide() * square.getSide();
    }
}