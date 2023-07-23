package org.example.BEHAVIOR.MEDIATOR;

public interface GameMediator {
    void sendMessage(Player sender, String message);
    void sendItem(Player sender, Player receiver, String item);
}
