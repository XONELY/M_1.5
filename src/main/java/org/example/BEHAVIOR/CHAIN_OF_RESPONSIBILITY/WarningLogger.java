package org.example.BEHAVIOR.CHAIN_OF_RESPONSIBILITY;

class WarningLogger extends Logger {
    public WarningLogger() {
        super(Logger.WARNING);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Warning Log: " + message);
    }
}