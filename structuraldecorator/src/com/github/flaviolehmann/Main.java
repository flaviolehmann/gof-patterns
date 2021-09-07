package com.github.flaviolehmann;

import com.github.flaviolehmann.service.PrinterService;
import com.github.flaviolehmann.service.decorator.DashPrinterServiceDecorator;
import com.github.flaviolehmann.service.decorator.HashPrinterServiceDecorator;

public class Main {

    private final PrinterService printerService;

    public Main(PrinterService printerService) {
        this.printerService = printerService;
    }

    public static void main(String[] args) {
        executeWithOneDecorator();
        executeWithBothDecorators();
    }

    private static void executeWithOneDecorator() {
        System.out.println("Executing with one decorator:");

        PrinterService printerService = new PrinterService();

        // Adding 1 decorator to printer
        printerService = new HashPrinterServiceDecorator(printerService);

        new Main(printerService).main();
    }

    private static void executeWithBothDecorators() {
        System.out.println("\nExecuting with both decorators:");
        PrinterService printerService = new PrinterService();

        // Adding 2 decorators to printer
        printerService = new HashPrinterServiceDecorator(printerService);
        printerService = new DashPrinterServiceDecorator(printerService);

        new Main(printerService).main();
    }

    public void main() {
        printerService.printMessage("Hello, Decorators!");
    }
}
