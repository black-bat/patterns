package org.example.structural.decorator;

public class PrintRight extends PrinterDecorator{
    public PrintRight(PrinterInterface printerInterface) {
        super(printerInterface);
    }
    @Override
    public void printWord() {
        super.printWord();
        System.out.print("]");
    }
}
