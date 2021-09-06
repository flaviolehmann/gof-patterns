package com.github.flaviolehmann;

import com.github.flaviolehmann.service.dto.PersonDTO;
import com.github.flaviolehmann.service.factory.PersonFactory;

public class Main {

    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        PersonDTO adultPerson = personFactory.createAdult("Flávio Lehmann");
        PersonDTO ancientPerson = personFactory.createAncient("Hebert Lehmann");

        System.out.println(adultPerson.getName() + " age is " + adultPerson.getAge());
        System.out.println(ancientPerson.getName() + " age is " + ancientPerson.getAge());
    }
}
