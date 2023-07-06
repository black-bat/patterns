package org.example.structural.bridge;

public class Car extends Transport{
    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive car ");
    }
}
