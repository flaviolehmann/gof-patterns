package com.github.flaviolehmann.service.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CivilianDTO implements PersonDTO {

    private String fullName;
    private LocalDate birth;
    private List<PersonDTO> subordinates = new ArrayList<>();

    public CivilianDTO(String fullName, LocalDate birth) {
        this.fullName = fullName;
        this.birth = birth;
    }

    @Override
    public String getIdentifier() {
        return fullName;
    }

    @Override
    public List<PersonDTO> getSubordinates() {
        return subordinates;
    }

    @Override
    public void setSubordinates(List<PersonDTO> subordinates) {
        this.subordinates = subordinates.stream()
                .filter(subordinate -> subordinate instanceof CivilianDTO)
                .collect(Collectors.toList());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
}
