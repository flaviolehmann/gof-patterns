package com.github.flaviolehmann.service.handler.impl;

import com.github.flaviolehmann.service.dto.MessageDTO;
import com.github.flaviolehmann.service.handler.BaseMessageHandler;
import com.github.flaviolehmann.service.handler.Handler;

public class AddWarningHandler extends BaseMessageHandler {

    public AddWarningHandler(Handler<MessageDTO> next) {
        super(next);
    }

    @Override
    public void handleImpl(MessageDTO messageDTO) {
        if (messageDTO.getSeverityLevel() > 10L) {
            messageDTO.setContent(messageDTO.getContent() + " (THIS IS SERIOUS!)");
        }
    }
}
