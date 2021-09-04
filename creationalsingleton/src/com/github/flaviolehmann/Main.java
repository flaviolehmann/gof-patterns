package com.github.flaviolehmann;

import com.github.flaviolehmann.config.DatabaseConnection;
import com.github.flaviolehmann.service.factory.DatabaseConnectionFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println(DatabaseConnection.getObjectsCount());
        DatabaseConnection databaseConnection0 = DatabaseConnectionFactory.getInstance();
        System.out.println(DatabaseConnection.getObjectsCount());
        DatabaseConnection databaseConnection1 = DatabaseConnectionFactory.getInstance();
        System.out.println(DatabaseConnection.getObjectsCount());
        DatabaseConnection databaseConnection2 = DatabaseConnectionFactory.getInstance();
        System.out.println(DatabaseConnection.getObjectsCount());
    }

}
