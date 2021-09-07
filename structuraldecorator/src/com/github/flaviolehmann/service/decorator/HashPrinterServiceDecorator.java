package com.github.flaviolehmann.service.decorator;

import com.github.flaviolehmann.service.PrinterService;

public class HashPrinterServiceDecorator extends PrinterServiceBaseDecorator {

    public HashPrinterServiceDecorator(PrinterService printerService) {
        super(printerService);
    }

    @Override
    public void printMessage(String message) {
        System.out.println("##########");
        printerService.printMessage(message);
        System.out.println("##########");
    }
}
