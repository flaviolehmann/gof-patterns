package com.github.flaviolehmann;

import com.github.flaviolehmann.service.dto.MessageDTO;
import com.github.flaviolehmann.service.handler.BaseMessageHandler;
import com.github.flaviolehmann.service.handler.impl.AddEmitterHandler;
import com.github.flaviolehmann.service.handler.impl.AddWarningHandler;
import com.github.flaviolehmann.service.handler.impl.CapitalizeHandler;
import com.github.flaviolehmann.service.handler.impl.PrinterHandler;

public class Main {

    public static void main(String ...args) {
        new Main().main();
    }

    public void main() {
        BaseMessageHandler entrypoint = initializeChainOfResponsibility();

        // First test
        entrypoint.handle(new MessageDTO("Simple and no-capitalized message", "Default Emitter", 1L));

        // First test
        entrypoint.handle(new MessageDTO("Serious and capitalized message", "Default Emitter", 7L));

        // First test
        entrypoint.handle(new MessageDTO("Real serious message", "Default Emitter", 12L));
    }

    private BaseMessageHandler initializeChainOfResponsibility() {
        // Last node
        PrinterHandler printer = new PrinterHandler();

        // Middle nodes
        AddWarningHandler warner = new AddWarningHandler(printer);
        BaseMessageHandler capitalizer = new CapitalizeHandler(printer, warner);

        // First node
        return new AddEmitterHandler(capitalizer);
    }
}
