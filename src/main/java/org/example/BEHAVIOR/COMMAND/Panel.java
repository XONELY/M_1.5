package org.example.BEHAVIOR.COMMAND;

public class Panel {
    private Switcher switcher;

    void setSwitcher(Switcher switcher) {
        this.switcher = switcher;
    }

    void pressButton() {
        switcher.switchButton();
    }

}

