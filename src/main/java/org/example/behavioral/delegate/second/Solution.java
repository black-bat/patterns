package org.example.behavioral.delegate.second;

public class Solution {
    public static void main(String[] args) {
        Graphics graphics1 = new Circle();
        Graphics graphics2 = new Square();
        Painter painter = new Painter();
        painter.setGraphics(graphics1);
        painter.drawPicture();
        painter.setGraphics(graphics2);
        painter.drawPicture();
    }
}
