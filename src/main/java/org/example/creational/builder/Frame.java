package org.example.creational.builder;


import org.example.creational.builder.enums.frame.ColorFrame;
import org.example.creational.builder.enums.frame.MaterialFrame;
import org.example.creational.builder.enums.frame.SizeFrame;
import org.example.creational.builder.enums.frame.TypeFrame;

public class Frame {
    private final TypeFrame type;
    private final MaterialFrame material;
    private final SizeFrame size;
    private final ColorFrame color;

    public Frame(TypeFrame type, MaterialFrame material, SizeFrame size, ColorFrame color) {
        this.type = type;
        this.material = material;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "type=" + type +
                ", material=" + material +
                ", size=" + size +
                ", color=" + color +
                '}';
    }
}
