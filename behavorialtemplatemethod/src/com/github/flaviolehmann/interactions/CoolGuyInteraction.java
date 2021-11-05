package com.github.flaviolehmann.interactions;

public class CoolGuyInteraction extends GuyInteractor {

    public CoolGuyInteraction() {
        super("Arthur");
    }

    @Override
    public String getMiddleOfSentence() {
        return "Good morning, bro!";
    }
}
