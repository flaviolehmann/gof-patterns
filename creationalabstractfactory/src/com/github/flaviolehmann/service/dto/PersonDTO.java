package com.github.flaviolehmann.service.dto;

import java.time.LocalDate;
import java.time.Period;


public class PersonDTO {

    private static Long instancesCount = 0L;

    private Long id;
    private String name;
    private LocalDate birth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Long getAge() {
        return (long) Period.between(birth, LocalDate.now()).getYears();
    }

    public PersonDTO() {
        instancesCount += 1;
        id = instancesCount;
    }
}
