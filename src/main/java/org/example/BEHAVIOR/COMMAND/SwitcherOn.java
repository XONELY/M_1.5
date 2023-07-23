package org.example.BEHAVIOR.COMMAND;

public class SwitcherOn implements Switcher {

    private Button button;

    public SwitcherOn(Button button){
        this.button = button;
    }

    @Override
    public void switchButton() {
        button.turnOn();
    }
}
