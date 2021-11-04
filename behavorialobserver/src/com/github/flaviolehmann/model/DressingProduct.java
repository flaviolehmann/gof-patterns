package com.github.flaviolehmann.model;

public class DressingProduct implements Product {

    private Long id;
    private String name;

    public DressingProduct(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DressingProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
