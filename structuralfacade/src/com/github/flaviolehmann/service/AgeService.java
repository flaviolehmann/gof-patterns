package com.github.flaviolehmann.service;

import com.github.flaviolehmann.service.dto.PersonDTO;

import java.time.LocalDate;
import java.time.Period;

/**
 * Facade for LocalDate.
 */
public class AgeService {

    private final Long ADULTHOOD_AGE = 18L;

    public Long getAgeInYears(PersonDTO person) {
        return (long) Period.between(person.getBirth(), LocalDate.now()).getYears();
    }

    public LocalDate getAdulthoodMinimumBornDate() {
        return LocalDate.now().minusYears(ADULTHOOD_AGE);
    }
}
