package org.example.BEHAVIOR.STRATEGY;

public class Runner {

    public static void main(String[] args) {
        Player player = new Player();
        player.setActivity(new AFK());
        player.play();

        player.setActivity(new PvE());
        player.play();
    }

}
