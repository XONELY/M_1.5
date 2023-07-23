package org.example.BEHAVIOR.CHAIN_OF_RESPONSIBILITY;

class Logger {
    public static final int INFO = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;

    private int logLevel;
    private Logger nextLogger;

    public Logger(int logLevel) {
        this.logLevel = logLevel;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (logLevel <= level) {
            writeMessage(message);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected void writeMessage(String message) {
        System.out.println("Log: " + message);
    }
}