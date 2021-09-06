package com.github.flaviolehmann.service.impl;

import com.github.flaviolehmann.service.MessageService;

import java.text.MessageFormat;
import java.util.List;

public class MessageServiceImpl implements MessageService {

    @Override
    public void sendMessages(List<String> messages) {
        String logMessage = MessageFormat.format("Sending {0} messages...", messages.size());
        System.out.println(logMessage);

        messages.forEach(message -> System.out.println("> " + message));
    }
}
