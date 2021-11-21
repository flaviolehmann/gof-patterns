package com.github.flaviolehmann;

public class CoolPrintCommand implements Command {

    private final String message;

    public CoolPrintCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("[THIS IS COOL]: " + message);
    }
}
