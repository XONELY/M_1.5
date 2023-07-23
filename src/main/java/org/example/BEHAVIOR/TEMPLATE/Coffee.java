package org.example.BEHAVIOR.TEMPLATE;

class Coffee extends HotBeverage {
    @Override
    public void brew() {
        System.out.println("brew coffee");
    }

    @Override
    public void addAdditions() {
        System.out.println("adding milk");
    }
}
