package com.github.flaviolehmann.service.handler.impl;

import com.github.flaviolehmann.service.dto.MessageDTO;
import com.github.flaviolehmann.service.handler.BaseMessageHandler;
import com.github.flaviolehmann.service.handler.Handler;

public class AddEmitterHandler extends BaseMessageHandler {

    public AddEmitterHandler(Handler<MessageDTO> next) {
        super(next);
    }

    @Override
    public void handleImpl(MessageDTO messageDTO) {
        if (messageDTO.getEmitter() != null) {
            String contentWithEmitter = String.format("[%s] %s", messageDTO.getEmitter(), messageDTO.getContent());
            messageDTO.setContent(contentWithEmitter);
        }
    }
}
