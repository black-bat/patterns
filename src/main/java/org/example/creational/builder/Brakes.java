package org.example.creational.builder;


import org.example.creational.builder.enums.brakes.CompanyBrakes;
import org.example.creational.builder.enums.brakes.TypeBrakes;

public class Brakes {
    private final TypeBrakes typeBrakes;
    private final CompanyBrakes companyBrakes;

    public Brakes(TypeBrakes typeBrakes, CompanyBrakes companyBrakes) {
        this.typeBrakes = typeBrakes;
        this.companyBrakes = companyBrakes;
    }

    @Override
    public String toString() {
        return "Brakes{" +
                "typeBrakes=" + typeBrakes +
                ", companyBrakes=" + companyBrakes +
                '}';
    }
}
