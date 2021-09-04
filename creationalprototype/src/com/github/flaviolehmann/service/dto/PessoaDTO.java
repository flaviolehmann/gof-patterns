package com.github.flaviolehmann.service.dto;

import com.github.flaviolehmann.service.prototype.Prototype;

import java.time.LocalDate;

public class PessoaDTO implements Prototype<PessoaDTO> {

    private Long id;
    private String name;
    private LocalDate birth;
    private AddressDTO addressDTO;

    @Override
    public PessoaDTO clone() {
        return new PessoaDTO(this);
    }

    public PessoaDTO(Long id, String name, LocalDate birth, AddressDTO addressDTO) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.addressDTO = addressDTO;
    }

    private PessoaDTO(PessoaDTO pessoaDTO) {
        this.id = pessoaDTO.id;
        this.name = pessoaDTO.name;
        this.birth = pessoaDTO.birth;
        this.addressDTO = pessoaDTO.addressDTO.clone();
    }

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

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }
}
