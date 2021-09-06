package com.github.flaviolehmann.service.dto;

import java.util.List;

public interface PersonDTO {

    String getIdentifier();
    List<PersonDTO> getSubordinates();
    void setSubordinates(List<PersonDTO> subordinates);
}
