package com.github.flaviolehmann.service.factory;

import com.github.flaviolehmann.service.dto.PersonDTO;

import java.time.LocalDate;

public class PersonFactory {

    private final Long ADULTHOOD_AGE = 18L;
    private final Long ANCIENTHOOD_AGE = 65L;

    public PersonDTO createAdult(String name) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName(name);
        personDTO.setBirth(LocalDate.now().minusYears(ADULTHOOD_AGE));
        return personDTO;
    }

    public PersonDTO createAncient(String name) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName(name);
        personDTO.setBirth(LocalDate.now().minusYears(ANCIENTHOOD_AGE));
        return personDTO;
    }
}
