package org.example.behavioral.delegate.first;

public class NewPrinter implements PrinterOffice {
    OldPrinter oldPrinter = new OldPrinter();

    @Override
    public void printSomething() {
        oldPrinter.printSomething();
    }
}
