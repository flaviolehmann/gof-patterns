package com.github.flaviolehmann;

import com.github.flaviolehmann.memento.caretaker.TextCaretaker;
import com.github.flaviolehmann.model.Text;

public class Main {

    public static void main(String ...args) {
        new Main().main();
    }

    public void main() {
        TextCaretaker textCaretaker = new TextCaretaker(new Text());

        // Setting up some states
        textCaretaker.doAction("First state");
        textCaretaker.doAction("Second state");
        textCaretaker.doAction("Third state");

        // Let's check its current state
        System.out.println(textCaretaker.getCurrentState());

        // Now we'll undo the last action
        textCaretaker.undoAction();
        System.out.println(textCaretaker.getCurrentState());

        // Again
        textCaretaker.undoAction();
        System.out.println(textCaretaker.getCurrentState());

        // Now we'll put it back to the second state
        textCaretaker.redoAction();
        System.out.println(textCaretaker.getCurrentState());
    }
}
