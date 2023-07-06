package org.example.structural.decorator;

public class PrintLeft extends PrinterDecorator{
    public PrintLeft(PrinterInterface printerInterface) {
        super(printerInterface);
    }
    @Override
    public void printWord() {
        System.out.print("[");
        super.printWord();
    }
}
