package com.github.flaviolehmann;

import com.github.flaviolehmann.service.builder.PessoaDTOBuilder;
import com.github.flaviolehmann.service.dto.PessoaDTO;

import java.text.MessageFormat;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PessoaDTO pessoaDTO = new PessoaDTOBuilder()
                .withId(1L)
                .withName("Flávio Lehmann")
                .withBirth(LocalDate.of(1999, 8, 27)).build();

        System.out.println(
                MessageFormat.format("Persons name is {0}", pessoaDTO.getName()));
    }

}
