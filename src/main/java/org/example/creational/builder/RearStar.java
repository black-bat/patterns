package org.example.creational.builder;


import org.example.creational.builder.enums.star.TeethStar;
import org.example.creational.builder.enums.star.TypeRearStar;

public class RearStar {
    private final TypeRearStar type;
    private final TeethStar teethStar;

    public RearStar(TypeRearStar type, TeethStar teethStar) {
        this.type = type;
        this.teethStar = teethStar;
    }

    @Override
    public String toString() {
        return "RearStar{" +
                "type=" + type +
                ", teethStar=" + teethStar +
                '}';
    }
}
