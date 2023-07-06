package org.example.structural.bridge;

public class Solution {
    public static void main(String[] args) {
        Transport transport1 = new Car(new BMW());
        Transport transport2 = new Bicycle(new Honda());
        transport1.drive();
        transport2.drive();
    }
}
