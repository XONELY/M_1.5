package org.example.BEHAVIOR.COMMAND;

public class Runner {
    public static void main(String[] args) {


        Button button = new Button();

        SwitcherOn switcherOn = new SwitcherOn(button);
        SwitcherOff switcherOff = new SwitcherOff(button);

        Panel panel = new Panel();

        panel.setSwitcher(switcherOn);
        panel.pressButton();
        panel.setSwitcher(switcherOff);
        panel.pressButton();

    }
}