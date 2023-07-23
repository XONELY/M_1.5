package org.example.BEHAVIOR.COMMAND;

public class Button {
    private boolean active;

    public void turnOn() {
        this.active = true;
        System.out.println("The button is on.");
    }

     void turnOff() {
        this.active = false;
        System.out.println("The button is off.");
    }
}
