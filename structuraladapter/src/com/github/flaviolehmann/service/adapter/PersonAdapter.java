package com.github.flaviolehmann.service.adapter;

import com.github.flaviolehmann.service.dto.Marine;
import com.github.flaviolehmann.service.dto.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class PersonAdapter extends Marine {

    public PersonAdapter(Person person) {
        setId(person.getId());
        setName(person.getName());
        setWarName(getPersonWarName(person));
        setAgeInYears(getPersonAge(person));
    }

    private String getPersonWarName(Person person) {
        return person.getName().toUpperCase(Locale.ROOT);
    }

    private Long getPersonAge(Person person) {
        return (long) Period.between(person.getBirth(), LocalDate.now()).getYears();
    }
}
