package org.example.BEHAVIOR.MEDIATOR;

public class Player {

    private String name;
    private GameMediator gameMediator;

    public Player(String name, GameMediator gameMediator) {
        this.name = name;
        this.gameMediator = gameMediator;
    }

    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        gameMediator.sendMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }

    public void sendItem(Player receiver, String item) {
        System.out.println(name + " sends item: " + item + " to " + receiver.getName());
        gameMediator.sendItem(this, receiver, item);
    }

    public void receiveItem(Player sender, String item) {
        System.out.println(name + " receives item: " + item + " from " + sender.getName());
    }

    public String getName() {
        return name;
    }
}
