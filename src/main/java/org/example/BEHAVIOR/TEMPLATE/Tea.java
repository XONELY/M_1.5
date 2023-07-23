package org.example.BEHAVIOR.TEMPLATE;

class Tea extends HotBeverage {
    @Override
    public void brew() {
        System.out.println("brew  tea");
    }

    @Override
    public void addAdditions() {
        System.out.println("Adding lemon");
    }
}
