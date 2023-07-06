package org.example.creational.singlton;

public class A {
    private static A program;

    public static A getProgram() {
        if (program == null) {
            program = new A();
        }
        return program;
    }

    private A() {
    }
}
