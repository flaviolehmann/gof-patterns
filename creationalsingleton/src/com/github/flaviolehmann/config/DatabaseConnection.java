package com.github.flaviolehmann.config;

public class DatabaseConnection {

    private static Long objectsCount = 0L;

    public DatabaseConnection() {
        objectsCount += 1;
    }

    public static Long getObjectsCount() {
        return objectsCount;
    }
}
