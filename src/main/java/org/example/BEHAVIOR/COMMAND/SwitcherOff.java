package org.example.BEHAVIOR.COMMAND;

public class SwitcherOff implements Switcher{

    private Button button;

    public SwitcherOff(Button button) {
        this.button = button;
    }

    @Override
    public void switchButton() {
        button.turnOff();
    }
}
