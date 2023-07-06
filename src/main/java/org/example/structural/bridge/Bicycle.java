package org.example.structural.bridge;

public class Bicycle extends Transport{
    public Bicycle(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive bicycle ");
    }
}
