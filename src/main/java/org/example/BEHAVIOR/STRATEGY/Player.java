package org.example.BEHAVIOR.STRATEGY;

public class Player {
    PlayerActivity playerActivity;

    public void setActivity(PlayerActivity playerActivity) {
        this.playerActivity = playerActivity;
    }
    public void play() {
        playerActivity.doSomething();
    }
}
