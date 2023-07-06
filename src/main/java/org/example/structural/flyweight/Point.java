package org.example.structural.flyweight;

public class Point implements Shape{
    @Override
    public void draw() {
        System.out.println("рисуем точку");
    }
}
