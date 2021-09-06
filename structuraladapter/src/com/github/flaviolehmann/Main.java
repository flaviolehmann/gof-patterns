package com.github.flaviolehmann;

import com.github.flaviolehmann.service.dto.Marine;
import com.github.flaviolehmann.service.MarineService;
import com.github.flaviolehmann.service.dto.Person;
import com.github.flaviolehmann.service.adapter.PersonAdapter;

import java.time.LocalDate;

public class Main {

    private final MarineService marineService = new MarineService();

    public static void main(String[] args) {
        Person person = new Person("Flávio Lehmann", LocalDate.now().minusYears(18));
        Marine marine = new PersonAdapter(person);

        new Main().marineService.showMarineName(marine);
    }
}
