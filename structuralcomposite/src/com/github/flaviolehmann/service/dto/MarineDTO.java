package com.github.flaviolehmann.service.dto;

import com.sun.xml.internal.ws.util.StringUtils;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MarineDTO implements PersonDTO {

    private String firstName;
    private String lastName;
    private Integer ageInYears;
    private List<PersonDTO> subordinates = new ArrayList<>();

    public MarineDTO(String firstName, String lastName, Integer ageInYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageInYears = ageInYears;
    }

    @Override
    public String getIdentifier() {
        return MessageFormat.format("{0}, {1}",
                lastName.toUpperCase(Locale.ROOT), StringUtils.capitalize(firstName));
    }

    @Override
    public List<PersonDTO> getSubordinates() {
        return subordinates;
    }

    @Override
    public void setSubordinates(List<PersonDTO> subordinates) {
        this.subordinates = new ArrayList<>(subordinates);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(Integer ageInYears) {
        this.ageInYears = ageInYears;
    }
}
