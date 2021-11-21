package com.github.flaviolehmann.service.handler.impl;

import com.github.flaviolehmann.service.dto.MessageDTO;
import com.github.flaviolehmann.service.handler.BaseMessageHandler;

import java.util.Locale;

public class CapitalizeHandler extends BaseMessageHandler {

    private final BaseMessageHandler cautionsHandler;
    private final BaseMessageHandler defaultHandler;

    public CapitalizeHandler(BaseMessageHandler defaultHandler, BaseMessageHandler cautionsHandler) {
        super(defaultHandler);
        this.defaultHandler = defaultHandler;
        this.cautionsHandler = cautionsHandler;
    }

    @Override
    public void handleImpl(MessageDTO messageDTO) {
        if (messageDTO.getSeverityLevel() > 5L) {
            updateMessageContent(messageDTO);
            setNext(cautionsHandler);
            return;
        }
        setNext(defaultHandler);
    }

    private void updateMessageContent(MessageDTO messageDTO) {
        messageDTO.setContent(messageDTO.getContent().toUpperCase(Locale.ROOT));
    }
}
