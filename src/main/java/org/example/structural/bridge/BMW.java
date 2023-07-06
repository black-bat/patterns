package org.example.structural.bridge;

public class BMW implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + "BMW");
    }
}
