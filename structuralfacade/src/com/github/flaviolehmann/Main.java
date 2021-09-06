package com.github.flaviolehmann;

import com.github.flaviolehmann.service.AgeService;
import com.github.flaviolehmann.service.dto.PersonDTO;

import java.text.MessageFormat;

public class Main {

    private final AgeService ageService;

    public Main(AgeService ageService) {
        this.ageService = ageService;
    }

    public static void main(String[] args) {
        Main execution = new Main(new AgeService());
        PersonDTO personDTO = new PersonDTO("Flávio Lehmann", execution.ageService.getAdulthoodMinimumBornDate());

        String message = MessageFormat.format("{0} age is {1}",
                personDTO.getName(), execution.ageService.getAgeInYears(personDTO));
        System.out.println(message);
    }
}
