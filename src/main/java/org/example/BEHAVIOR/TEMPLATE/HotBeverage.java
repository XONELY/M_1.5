package org.example.BEHAVIOR.TEMPLATE;

abstract class HotBeverage {
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addAdditions();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void addAdditions();
}
