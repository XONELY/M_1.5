package org.example.BEHAVIOR.CHAIN_OF_RESPONSIBILITY;

class ErrorLogger extends Logger {
    public ErrorLogger() {
        super(Logger.ERROR);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Error Log: " + message);
    }
}