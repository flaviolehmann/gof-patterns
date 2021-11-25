package com.github.flaviolehmann.memento.snapshot;

import com.github.flaviolehmann.model.Text;

public class TextSnapshot implements Snapshot {

    private final Text text;
    private final String content;

    public TextSnapshot(Text text) {
        this.text = text;
        content = text.getContent();
    }

    public Text getText() {
        return text;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void execute() {
        text.setContent(content);
    }
}
