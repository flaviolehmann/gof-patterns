package com.github.flaviolehmann.domain;

public class Model {

    private static Long instancesCount = 0L;

    private final Long id;
    private final Integer year;
    private final String description;

    public Model(Integer year, String description) {
        this.id = ++instancesCount;
        this.year = year;
        this.description = description;
    }

    public static Long getInstancesCount() {
        return instancesCount;
    }

    public Integer getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }
}
