package com.github.flaviolehmann;

import com.github.flaviolehmann.service.MessageService;
import com.github.flaviolehmann.service.impl.MessageServiceImpl;
import com.github.flaviolehmann.service.proxy.MessageServiceProxy;

import java.util.Arrays;

public class Main {

    private final MessageService messageService;

    public Main(MessageService messageService) {
        this.messageService = messageService;
    }

    public static void main(String[] args) {
        System.out.println("\n// Using original message service");
        sendMessagesUsingOriginalMessageService();

        System.out.println("\n// Using proxied message service");
        sendMessagesUsingProxiedMessageService();
    }

    private static void sendMessagesUsingOriginalMessageService() {
        Main executionContext = new Main(new MessageServiceImpl());
        sendGroupOfMessages(executionContext);
    }

    private static void sendMessagesUsingProxiedMessageService() {
        Main executionContext = new Main(new MessageServiceProxy(new MessageServiceImpl()));
        sendGroupOfMessages(executionContext);
    }

    private static void sendGroupOfMessages(Main executionContext) {
        executionContext.messageService.sendMessages(Arrays.asList("Message 1", "Message 2"));
        executionContext.messageService.sendMessages(Arrays.asList("Message 3", "Message 4"));
        executionContext.messageService.sendMessages(Arrays.asList("Message 5", "Message 6"));
        executionContext.messageService.sendMessages(Arrays.asList("Message 7", "Message 8"));
        executionContext.messageService.sendMessages(Arrays.asList("Message 9", "Message 10"));
        executionContext.messageService.sendMessages(Arrays.asList("Message 11", "Message 12"));
        executionContext.messageService.sendMessages(Arrays.asList("Message 13", "Message 14"));
    }
}
