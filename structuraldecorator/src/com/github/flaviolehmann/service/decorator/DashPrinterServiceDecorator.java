package com.github.flaviolehmann.service.decorator;

import com.github.flaviolehmann.service.PrinterService;

public class DashPrinterServiceDecorator extends PrinterServiceBaseDecorator {

    public DashPrinterServiceDecorator(PrinterService printerService) {
        super(printerService);
    }

    @Override
    public void printMessage(String message) {
        System.out.println("__________");
        printerService.printMessage(message);
        System.out.println("__________");
    }
}
