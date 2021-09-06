package com.github.flaviolehmann.service.factory;

import com.github.flaviolehmann.service.dto.PersonDTO;

public abstract class PersonFactory {

    public abstract PersonDTO createAdult();
    public abstract PersonDTO createAncient();
}
