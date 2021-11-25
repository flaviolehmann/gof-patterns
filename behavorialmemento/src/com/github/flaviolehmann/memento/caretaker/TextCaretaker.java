package com.github.flaviolehmann.memento.caretaker;

import com.github.flaviolehmann.memento.snapshot.Snapshot;
import com.github.flaviolehmann.memento.snapshot.TextSnapshot;
import com.github.flaviolehmann.model.Text;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class TextCaretaker {

    private final Text text;

    private final Deque<Snapshot> undoActionList = new ArrayDeque<>();
    private final Deque<Snapshot> redoActionList = new ArrayDeque<>();

    public TextCaretaker(Text text) {
        this.text = text;
    }

    public String getCurrentState() {
        return text.getContent();
    }

    public void doAction(String state) {
        undoActionList.add(new TextSnapshot(text));
        text.setContent(state);
    }

    public void undoAction() {
        redoActionList.add(new TextSnapshot(text));
        Optional.ofNullable(undoActionList.pollLast()).ifPresent(Snapshot::execute);
    }

    public void redoAction() {
        undoActionList.add(new TextSnapshot(text));
        Optional.ofNullable(redoActionList.pollLast()).ifPresent(Snapshot::execute);
    }
}
