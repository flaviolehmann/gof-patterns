package com.github.flaviolehmann.service.dto;

public class Marine {

    private Long id;
    private String name;
    private String warName;
    private Long ageInYears;

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

    public String getWarName() {
        return warName;
    }

    public void setWarName(String warName) {
        this.warName = warName;
    }

    public Long getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(Long ageInYears) {
        this.ageInYears = ageInYears;
    }
}
