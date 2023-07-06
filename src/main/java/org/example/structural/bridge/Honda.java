package org.example.structural.bridge;

public class Honda implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + "Honda");
    }
}
