package org.example.BEHAVIOR.MEDIATOR;

import java.util.ArrayList;
import java.util.List;

class OnlineGame implements GameMediator {
    private List<Player> players;

    public OnlineGame() {
        players = new ArrayList<>();
    }

    @Override
    public void sendMessage(Player sender, String message) {
        for (Player player : players) {
            if (player != sender) {
                player.receiveMessage(message);
            }
        }
    }

    @Override
    public void sendItem(Player sender, Player receiver, String item) {
        receiver.receiveItem(sender, item);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}

