package org.example.CREATIONAL.SINGLETON;

public class DBConnection {
    private static DBConnection dbc;
    private boolean connStatus = false;

    private DBConnection() {
        System.out.println("Connecting to database...");
        connStatus = true;
    }

    public static DBConnection getDbc() {
        if (dbc == null) {
            dbc = new DBConnection();
        }
        return dbc;
    }

    public boolean isConnected() {
        System.out.println("Connection status: " + connStatus);
        return connStatus;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}

