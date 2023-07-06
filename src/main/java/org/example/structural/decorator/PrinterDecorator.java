package org.example.structural.decorator;

public abstract class PrinterDecorator implements PrinterInterface {
    PrinterInterface printerInterface;

    public PrinterDecorator(PrinterInterface printerInterface) {
        this.printerInterface = printerInterface;
    }

    @Override
    public void printWord() {
        printerInterface.printWord();
    }
}
