package org.example.creational.builder;


import org.example.creational.builder.enums.pendant.TypePendant;

public class Pendant {
    private final TypePendant pendant;

    public Pendant(TypePendant pendant) {
        this.pendant = pendant;
    }

    @Override
    public String toString() {
        return "Pendant{" +
                "pendant=" + pendant +
                '}';
    }
}
