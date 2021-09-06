package com.github.flaviolehmann.service.factory;

import com.github.flaviolehmann.service.dto.PersonDTO;

import java.time.LocalDate;

public class GermanyPersonFactory extends PersonFactory {

    private static Long ADULTHOOD_AGE = 17L;
    private static Long ANCIENT_AGE = 72L;

    @Override
    public PersonDTO createAdult() {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setBirth(LocalDate.now().minusYears(ADULTHOOD_AGE));
        return personDTO;
    }

    @Override
    public PersonDTO createAncient() {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setBirth(LocalDate.now().minusYears(ANCIENT_AGE));
        return personDTO;
    }
}
