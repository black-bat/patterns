package org.example.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        FacadeShape facadeShape = new FacadeShape();
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(facadeShape.getShape("circle"));
        shapeList.add(facadeShape.getShape("circle"));
        shapeList.add(facadeShape.getShape("point"));
        shapeList.add(facadeShape.getShape("square"));
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }
}
