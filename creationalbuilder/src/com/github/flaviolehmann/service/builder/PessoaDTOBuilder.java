package com.github.flaviolehmann.service.builder;

import com.github.flaviolehmann.service.dto.PessoaDTO;

import java.time.LocalDate;

public class PessoaDTOBuilder implements Builder<PessoaDTO> {

    PessoaDTO pessoaDTO = new PessoaDTO();

    @Override
    public PessoaDTO build() {
        return pessoaDTO;
    }

    public PessoaDTOBuilder withId(Long id) {
        pessoaDTO.setId(id);
        return this;
    }

    public PessoaDTOBuilder withName(String name) {
        pessoaDTO.setName(name);
        return this;
    }

    public PessoaDTOBuilder withBirth(LocalDate birth) {
        pessoaDTO.setBirth(birth);
        return this;
    }
}
