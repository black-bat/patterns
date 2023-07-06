package org.example.behavioral.delegate.second;

public class Painter {
    Graphics graphics;

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
    public void drawPicture(){
        graphics.draw();
    }
}
