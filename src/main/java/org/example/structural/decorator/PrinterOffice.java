package org.example.structural.decorator;

public class PrinterOffice implements PrinterInterface {
    @Override
    public void printWord() {
        System.out.print("=(A)=");
    }
}
