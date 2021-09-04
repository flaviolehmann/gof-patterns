package com.github.flaviolehmann;

import com.github.flaviolehmann.service.dto.AddressDTO;
import com.github.flaviolehmann.service.dto.PessoaDTO;

import java.text.MessageFormat;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PessoaDTO pessoaDTO = new PessoaDTO(
                1L, "Flávio Lehmann", LocalDate.of(1999, 8, 27),
                new AddressDTO(1L, "Brazil", "Espírito Santo")
        );
        PessoaDTO clonedPessoaDto = pessoaDTO.clone();
        System.out.println(
                MessageFormat.format("Cloned person name is {0}", clonedPessoaDto.getName())
        );
    }

}
