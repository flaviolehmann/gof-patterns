package com.github.flaviolehmann.mediator.components;

import com.github.flaviolehmann.mediator.event.CheckboxChangeValueEvent;
import com.github.flaviolehmann.mediator.event.Event;

import java.util.ArrayList;
import java.util.List;

public class Checkbox implements Component {

    private Boolean value = Boolean.FALSE;
    private List<Component> eventListeners = new ArrayList<>();

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
        emitEvent(new CheckboxChangeValueEvent());
    }

    @Override
    public void readEvent(Event event) {
    }

    @Override
    public void appendEventListeners(Component newListener) {
        eventListeners.add(newListener);
    }

    @Override
    public List<Component> getEventListeners() {
        return eventListeners;
    }
}
