package com.github.flaviolehmann.service.dto;

public class Car implements Automobile {

    private Long speed = 0L;

    @Override
    public void horn() {
        System.out.println("Honk Honk!");
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
