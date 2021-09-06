package com.github.flaviolehmann.service.dto;

public class Pilot {

    protected Automobile automobile;

    public Pilot(Automobile automobile) {
        this.automobile = automobile;
    }

    public void accelerate(Long speed) {
        automobile.setSpeed(automobile.getSpeed() + speed);
    }

    public void slowDown(Long speed) {
        automobile.setSpeed(automobile.getSpeed() - speed);
    }

    public void horn() {
        automobile.horn();
    }
}
