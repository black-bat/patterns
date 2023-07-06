package org.example.behavioral.delegate.first;

public class OldPrinter implements PrinterOffice{
    @Override
    public void printSomething() {
        System.out.println("печатаю документы");
    }
}
