package com.github.flaviolehmann.service.handler;

import com.github.flaviolehmann.service.dto.MessageDTO;

public abstract class BaseMessageHandler implements Handler<MessageDTO> {

    protected Handler<MessageDTO> next;

    public BaseMessageHandler(Handler<MessageDTO> next) {
        this.next = next;
    }

    @Override
    public void setNext(Handler<MessageDTO> handler) {
        next = handler;
    }

    @Override
    public final void handle(MessageDTO messageDTO) {
        handleImpl(messageDTO);
        if (next != null) {
            next.handle(messageDTO);
        }
    }

    protected abstract void handleImpl(MessageDTO messageDTO);
}
