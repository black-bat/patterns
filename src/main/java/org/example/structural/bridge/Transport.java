package org.example.structural.bridge;

public abstract class Transport {
    Model model;

    public Transport(Model model) {
        this.model = model;
    }
    abstract void drive();
}
