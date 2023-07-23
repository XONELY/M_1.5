package org.example.BEHAVIOR.CHAIN_OF_RESPONSIBILITY;

public class Runner {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger warningLogger = new WarningLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);


        infoLogger.logMessage(Logger.INFO, "NOTHING SPECIAL.");
        infoLogger.logMessage(Logger.WARNING, "WARNING.");
        infoLogger.logMessage(Logger.ERROR, "ERROR.");
    }
}
