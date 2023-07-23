package org.example.BEHAVIOR.INTERPRETER;

public class NumberExp implements Expression {
    private int number;

    NumberExp(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
