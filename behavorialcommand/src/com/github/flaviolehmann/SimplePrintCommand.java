package com.github.flaviolehmann;

public class SimplePrintCommand implements Command {

    private final String message;

    public SimplePrintCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}
