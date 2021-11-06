package com.github.flaviolehmann.mediator.components;

import com.github.flaviolehmann.mediator.TitleLabel;
import com.github.flaviolehmann.mediator.event.CheckboxChangeValueEvent;
import com.github.flaviolehmann.mediator.event.Event;

import java.util.ArrayList;
import java.util.List;

public class FrameView implements Component {

    private Checkbox checkbox;
    private TitleLabel titleLabel;
    private Long checkboxChangesCount = 0L;

    public FrameView(Checkbox checkbox, TitleLabel titleLabel) {
        this.checkbox = checkbox;
        this.checkbox.appendEventListeners(this);
        this.titleLabel = titleLabel;
    }

    public Checkbox getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(Checkbox checkbox) {
        this.checkbox = checkbox;
    }

    public TitleLabel getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(TitleLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    @Override
    public void readEvent(Event event) {
        if (event instanceof CheckboxChangeValueEvent) {
            titleLabel.setContent("Checkbox changed value " + ++checkboxChangesCount + " times.");
        }
    }

    @Override
    public void appendEventListeners(Component newListener) {
    }

    @Override
    public List<Component> getEventListeners() {
        return new ArrayList<>();
    }
}
