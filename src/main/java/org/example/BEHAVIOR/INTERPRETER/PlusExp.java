package org.example.BEHAVIOR.INTERPRETER;

public class PlusExp implements Expression {

    private Expression a;
    private Expression b;

    public PlusExp(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int interpret() {
        return a.interpret() + b.interpret();
    }
}
