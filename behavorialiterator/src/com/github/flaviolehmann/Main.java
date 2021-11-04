package com.github.flaviolehmann;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Library myLibrary = new Library(1L, "Cool Library");

        Book harryPotter = new Book(1L, "Harry Potter");
        Book aSongOfIceAndFire = new Book(2L, "A Song Of Ice And Fire");
        Book percyJackson = new Book(3L, "Percy Jackson");

        myLibrary.setCatalog(new ArrayList<>(Arrays.asList(harryPotter, aSongOfIceAndFire, percyJackson)));
        myLibrary.setFavoriteBook(harryPotter);

        // Notice that the Harry Potter book will be printed twice
        myLibrary.forEach(System.out::println);
    }
}
