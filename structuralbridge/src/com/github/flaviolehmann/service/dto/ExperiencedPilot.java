package com.github.flaviolehmann.service.dto;

public class ExperiencedPilot extends Pilot {

    public void totallyBreak() {
        automobile.setSpeed(0L);
    }

    public ExperiencedPilot(Automobile automobile) {
        super(automobile);
    }
}
