package com.github.flaviolehmann;

import com.github.flaviolehmann.service.PersonService;
import com.github.flaviolehmann.service.dto.CivilianDTO;
import com.github.flaviolehmann.service.dto.MarineDTO;
import com.github.flaviolehmann.service.dto.PersonDTO;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    private final PersonService personService;

    public Main(PersonService personService) {
        this.personService = personService;
    }

    public static void main(String[] args) {
        new Main(new PersonService()).main();
    }

    public void main() {
        personService.showHierarchy(createPersonHierarchy());
    }

    private PersonDTO createPersonHierarchy() {
        // First Level
        PersonDTO highestRank = new MarineDTO("Hebert", "Lehmann", 18);

        // Second Level
        PersonDTO mediumRank1 = new MarineDTO("Silvio", "Lehmann", 18);
        PersonDTO mediumRank2 = new MarineDTO("Flavio", "Lehmann", 18);
        highestRank.setSubordinates(Arrays.asList(mediumRank1, mediumRank2));

        // Third Level
        PersonDTO lowestRank = new MarineDTO("Claudia", "Lehmann", 18);
        PersonDTO civilian = new CivilianDTO("Flávio Lehmann Júnior", LocalDate.now().minusYears(18));
        mediumRank1.setSubordinates(Arrays.asList(lowestRank, civilian));

        return highestRank;
    }
}
