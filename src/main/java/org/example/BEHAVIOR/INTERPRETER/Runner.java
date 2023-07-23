package org.example.BEHAVIOR.INTERPRETER;

public class Runner {
    public static void main(String[] args) {

        Expression expression = new MinusExp(new NumberExp(12),new NumberExp(11));
        int result = expression.interpret();
        System.out.println(result);
    }
}
