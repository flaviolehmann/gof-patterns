package com.github.flaviolehmann.model;

public class CookingProduct implements Product {

    private Long id;
    private String name;

    public CookingProduct(Long id, String name) {
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
