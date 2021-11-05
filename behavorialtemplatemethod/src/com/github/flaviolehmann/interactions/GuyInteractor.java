package com.github.flaviolehmann.interactions;

public abstract class GuyInteractor {

    protected String name;

    private String getFirstPartOfSentence() {
        return "A guy whose name is " + name + " says: ";
    }

    protected abstract String getMiddleOfSentence();

    private String getLastPartOfSentence() {
        return "    >>>\n";
    }

    public String getWholeSentence() {
        return getFirstPartOfSentence() + getMiddleOfSentence() + getLastPartOfSentence();
    }

    public GuyInteractor(String name) {
        this.name = name;
    }
}
