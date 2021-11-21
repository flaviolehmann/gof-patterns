package com.github.flaviolehmann;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String ...args) {
        new Main().main();
    }

    public void main() {
        List<Command> commandList = new ArrayList<>();

        // Adding some commands to list
        commandList.add(new SimplePrintCommand("Simple message"));
        commandList.add(new CoolPrintCommand("Cool message"));

        // Executing then
        commandList.forEach(Command::execute);
    }
}
