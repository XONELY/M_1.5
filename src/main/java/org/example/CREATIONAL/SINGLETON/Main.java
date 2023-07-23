package org.example.CREATIONAL.SINGLETON;

public class Main {
    public static void main(String[] args) {

        DBConnection dbc = DBConnection.getDbc();
        if (dbc.isConnected()){
            dbc.executeQuery("SELECT * FROM users");
        }
    }
}
