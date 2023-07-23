package org.example.BEHAVIOR.MEDIATOR;

public class Runner {
    public static void main(String[] args) {
        OnlineGame onlineGame = new OnlineGame();

        Player player1 = new Player("Стив2008", onlineGame);
        Player player2 = new Player("Херобрин", onlineGame);


        onlineGame.addPlayer(player1);
        onlineGame.addPlayer(player2);


        player1.sendMessage("Да ты че.....");
        player2.sendItem(player1, "PickAxe");
    }
}
