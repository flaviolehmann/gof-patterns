package com.github.flaviolehmann;

import com.github.flaviolehmann.service.dto.Automobile;
import com.github.flaviolehmann.service.dto.Car;
import com.github.flaviolehmann.service.dto.ExperiencedPilot;
import com.github.flaviolehmann.service.dto.Motocicle;
import com.github.flaviolehmann.service.dto.Pilot;

public class Main {

    public static void main(String[] args) {
        Automobile car = new Car();
        Pilot pilot = new Pilot(car);
        pilot.horn();

        Automobile bike = new Motocicle();
        pilot = new ExperiencedPilot(bike);
        pilot.horn();
    }
}
