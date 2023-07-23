package org.example.BEHAVIOR.INTERPRETER.VISITOR;

interface ShapeVisitor {
    void visitCircle(Circle circle);

    void visitSquare(Square square);
}
