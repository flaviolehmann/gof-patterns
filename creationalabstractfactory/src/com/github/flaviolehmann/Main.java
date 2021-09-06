package com.github.flaviolehmann;

import com.github.flaviolehmann.service.dto.PersonDTO;
import com.github.flaviolehmann.service.factory.BrazilianPersonFactory;
import com.github.flaviolehmann.service.factory.GermanyPersonFactory;
import com.github.flaviolehmann.service.factory.PersonFactory;

public class Main {

    private static PersonFactory personFactory;

    public static void main(String[] args) {
        useBrazilianPersonFactory();
        PersonDTO brazilianAdult = personFactory.createAdult();
        brazilianAdult.setName("Flávio Lehmann");
        System.out.println(brazilianAdult.getName() + " age is " + brazilianAdult.getAge());

        useGermanyPersonFactory();
        PersonDTO germanyAdult = personFactory.createAdult();
        germanyAdult.setName("Hebert Lehmann");
        System.out.println(germanyAdult.getName() + " age is " + germanyAdult.getAge());
    }

    private static void useGermanyPersonFactory() {
        personFactory = new GermanyPersonFactory();
    }

    private static void useBrazilianPersonFactory() {
        personFactory = new BrazilianPersonFactory();
    }
}
