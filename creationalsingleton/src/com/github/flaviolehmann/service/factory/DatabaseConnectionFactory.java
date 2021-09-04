package com.github.flaviolehmann.service.factory;

import com.github.flaviolehmann.config.DatabaseConnection;

import java.util.Objects;

public class DatabaseConnectionFactory {

    private static DatabaseConnection databaseConnection;

    public static DatabaseConnection getInstance() {
        if (Objects.isNull(databaseConnection)) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

    private DatabaseConnectionFactory() { }
}
