package org.example.BEHAVIOR.STATE;

public class Player {
    private PlayerState playerState;
    Player(){
        playerState = new StopState();

    }

    public void setState(PlayerState playerState){
        this.playerState = playerState;
    }
    public void play(){
        playerState.play();
        setState(new PlayState());
    }
    public void stop(){
        playerState.stop();
        setState(new StopState());
    }

}
