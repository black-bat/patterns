package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FacadeShape {
    Map<String, Shape> shapeMap = new HashMap<>();

    /**
     * не создаем новые объекты, а переиспользуем уже имеющиеся
     * @param shapeName
     * @return
     */
    public Shape getShape(String shapeName) {
        Shape shape = shapeMap.get(shapeName);
        if (shape == null) {
            switch (shapeName) {
                case "circle":
                    shape = new Circle();
                    break;
                case "point":
                    shape = new Point();
                    break;
                case "square":
                    shape = new Square();
                    break;
            }
            shapeMap.put(shapeName, shape);
        }
        return shape;
    }
}
