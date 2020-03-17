package com.acme.dbo.txlog;

public class Facade {
    private static final String REFERENCE = "reference: ";
    private static final String PRIMITIVE = "primitive: ";
    private static final String STRING = "string: ";
    private static final String CHAR = "char: ";

    public static void log(int message) {
        printMessage(PRIMITIVE, String.valueOf(message));
    }

    public static void log(byte message) {
        printMessage(PRIMITIVE, String.valueOf(message));
    }


    public static void log(String message) {
        printMessage(STRING, message);
    }

    public static void log(boolean message) {
        printMessage(PRIMITIVE, String.valueOf(message));
    }


    public static void log(Object message) {
        printMessage(REFERENCE, String.valueOf(message));
    }

    public static void log (char message) {
        printMessage(CHAR, String.valueOf(message));
    }


    private static void printMessage(String prefix, String message) {
        System.out.println(prefix + message);
    }
}
