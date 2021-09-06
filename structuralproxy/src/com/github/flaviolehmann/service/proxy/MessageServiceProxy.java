package com.github.flaviolehmann.service.proxy;

import com.github.flaviolehmann.service.MessageService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MessageServiceProxy implements MessageService {

    private final MessageService realMessageService;
    private final List<String> bufferedMessages = new ArrayList<>();
    private final Long bufferSize = 5L;

    public MessageServiceProxy(MessageService realMessageService) {
        this.realMessageService = realMessageService;
    }

    @Override
    public void sendMessages(List<String> messages) {
        bufferedMessages.addAll(messages);
        if (bufferedMessages.size() > bufferSize) {
            emptyBuffer();
        }
    }

    private void emptyBuffer() {
        AtomicInteger counter = new AtomicInteger(0);
        bufferedMessages.stream()
                .collect(Collectors.groupingBy(s -> counter.getAndIncrement() / bufferSize))
                .values().forEach(realMessageService::sendMessages);
        bufferedMessages.clear();
    }
}
