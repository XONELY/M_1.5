package org.example.BEHAVIOR.STATE;

public class PlayState implements PlayerState {
    @Override
    public void play() {
        System.out.println("Already Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }
}
