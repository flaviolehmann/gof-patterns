package com.github.flaviolehmann.service;

import com.github.flaviolehmann.service.dto.Marine;

import java.text.MessageFormat;

public class MarineService {

    public void showMarineName(Marine marine) {
        String message = MessageFormat.format("Marine name is {0}, {1} years old",
                marine.getName(), marine.getAgeInYears());
        System.out.println(message);
    }
}
