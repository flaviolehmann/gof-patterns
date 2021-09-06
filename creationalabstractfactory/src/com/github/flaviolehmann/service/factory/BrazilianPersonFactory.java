package com.github.flaviolehmann.service.factory;


import com.github.flaviolehmann.service.dto.PersonDTO;

import java.time.LocalDate;

public class BrazilianPersonFactory extends PersonFactory {

    private static Long ADULTHOOD_AGE = 18L;
    private static Long ANCIENT_AGE = 65L;

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
