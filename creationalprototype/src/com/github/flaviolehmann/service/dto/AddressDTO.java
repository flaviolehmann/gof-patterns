package com.github.flaviolehmann.service.dto;

import com.github.flaviolehmann.service.prototype.Prototype;

public class AddressDTO implements Prototype<AddressDTO> {

    private Long id;
    private String line1;
    private String line2;

    @Override
    public AddressDTO clone() {
        return new AddressDTO(this);
    }

    public AddressDTO(Long id, String line1, String line2) {
        this.id = id;
        this.line1 = line1;
        this.line2 = line2;
    }

    public AddressDTO(AddressDTO addressDTO) {
        this.id = addressDTO.id;
        this.line1 = addressDTO.line1;
        this.line2 = addressDTO.line2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }
}
