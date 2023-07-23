package org.example.BEHAVIOR.INTERPRETER;

public class MinusExp implements Expression{
    private Expression a;
    private Expression b;

    public MinusExp(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int interpret() {
        return a.interpret() - b.interpret();
    }
}
