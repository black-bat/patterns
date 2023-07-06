package org.example.behavioral.delegate.first;

public class Solution {
    public static void main(String[] args) {
        PrinterOffice oldPrinter = new OldPrinter();
        oldPrinter.printSomething();
        PrinterOffice newPrinter = new NewPrinter();
        newPrinter.printSomething();
    }
}
