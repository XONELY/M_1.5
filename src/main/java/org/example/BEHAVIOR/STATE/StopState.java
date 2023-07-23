package org.example.BEHAVIOR.STATE;

public class StopState implements PlayerState {
    @Override
    public void play() {
        System.out.println("Started ");
    }


    @Override
    public void stop() {
        System.out.println("Already Stopped ");
    }
}
