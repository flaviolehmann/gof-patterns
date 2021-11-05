package com.github.flaviolehmann.interactions;

public class NotThatCoolGuyInteraction extends GuyInteractor {

    public NotThatCoolGuyInteraction() {
        super("Micah");
    }

    @Override
    public String getMiddleOfSentence() {
        return "Shut up, bro.";
    }
}
