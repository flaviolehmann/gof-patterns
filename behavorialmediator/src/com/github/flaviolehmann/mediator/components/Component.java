package com.github.flaviolehmann.mediator.components;

import com.github.flaviolehmann.mediator.event.Event;

import java.util.List;

public interface Component {

    default void emitEvent(Event event) {
        getEventListeners().forEach(e -> e.readEvent(event));
    }

    void readEvent(Event event);
    void appendEventListeners(Component newListener);
    List<Component> getEventListeners();
}
