package com.github.flaviolehmann.domain;

public class Car {

    private static Long instancesCount = 0L;

    private final Long id;
    private final String serialNumber;
    private final Model model;

    public Car(String serialNumber, Model model) {
        this.id = ++instancesCount;
        this.serialNumber = serialNumber;
        this.model = model;
    }

    public static Long getInstancesCount() {
        return instancesCount;
    }
}
