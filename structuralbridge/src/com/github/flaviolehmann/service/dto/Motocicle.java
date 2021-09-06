package com.github.flaviolehmann.service.dto;

public class Motocicle implements Automobile {

    private Long speed = 0L;

    @Override
    public void horn() {
        System.out.println("Bip Bip!");
    }

    @Override
    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    @Override
    public Long getSpeed() {
        return speed;
    }
}
