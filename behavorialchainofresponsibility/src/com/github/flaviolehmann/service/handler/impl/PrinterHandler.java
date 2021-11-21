package com.github.flaviolehmann.service.handler.impl;

import com.github.flaviolehmann.service.dto.MessageDTO;
import com.github.flaviolehmann.service.handler.BaseMessageHandler;
import com.github.flaviolehmann.service.handler.Handler;

public class PrinterHandler extends BaseMessageHandler {

    public PrinterHandler(Handler<MessageDTO> next) {
        super(next);
    }

    public PrinterHandler() {
        super(null);
    }

    @Override
    public void handleImpl(MessageDTO messageDTO) {
        System.out.println(messageDTO.getContent());
    }
}
