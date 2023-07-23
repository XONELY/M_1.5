package org.example.BEHAVIOR.STRATEGY;

public class AFK implements PlayerActivity{
    @Override
    public void doSomething() {
        System.out.println("AFK");
    }
}
