package org.example.structural.decorator;

public class Solution {
    public static void main(String[] args) {
        PrinterInterface printerInterface = new PrintRight(new PrintLeft(new PrinterOffice()));
        printerInterface.printWord();
    }
}
