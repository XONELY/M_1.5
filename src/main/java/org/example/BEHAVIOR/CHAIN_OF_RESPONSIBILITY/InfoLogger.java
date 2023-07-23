package org.example.BEHAVIOR.CHAIN_OF_RESPONSIBILITY;

class InfoLogger extends Logger {
    public InfoLogger() {
        super(Logger.INFO);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Info Log: " + message);
    }
}
