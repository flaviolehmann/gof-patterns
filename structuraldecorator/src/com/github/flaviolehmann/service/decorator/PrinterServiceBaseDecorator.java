package com.github.flaviolehmann.service.decorator;

import com.github.flaviolehmann.service.PrinterService;

public abstract class PrinterServiceBaseDecorator extends PrinterService {

    protected PrinterService printerService;

    public PrinterServiceBaseDecorator(PrinterService printerService) {
        this.printerService = printerService;
    }

    public void printMessage(String message) {
        printerService.printMessage(message);
    }
}
