package org.example.STRUCTURAL.COMPOSITE;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Component play = new MenuItem("Play");
        Component settings = new MenuItem("Settings");

        Menu menu = new Menu("Main Menu:");
        menu.add(play);
        menu.add(settings);

        Component graphics = new MenuItem("Graphics");
        Component sound = new MenuItem("Sound");

        Menu settingsMenu = new Menu("Settings Menu:");
        settingsMenu.add(graphics);
        settingsMenu.add(sound);

        menu.show();

        Thread.sleep(1000);
        System.err.println("**Imagine that you clicked on the settings menu**");
        Thread.sleep(2000);

        settingsMenu.show();

    }
}
