package com.github.flaviolehmann.service.dto;

import java.time.LocalDate;

public class PersonDTO {

    private static Long objectsCount = 0L;

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

    public PersonDTO(String name, LocalDate birth) {
        this.id = ++objectsCount;
        this.name = name;
        this.birth = birth;
    }
}
