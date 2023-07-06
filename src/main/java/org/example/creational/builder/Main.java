package org.example.creational.builder;


import org.example.creational.builder.enums.CompanyBicycle;
import org.example.creational.builder.enums.brakes.CompanyBrakes;
import org.example.creational.builder.enums.brakes.TypeBrakes;
import org.example.creational.builder.enums.frame.ColorFrame;
import org.example.creational.builder.enums.frame.MaterialFrame;
import org.example.creational.builder.enums.frame.SizeFrame;
import org.example.creational.builder.enums.frame.TypeFrame;
import org.example.creational.builder.enums.pendant.TypePendant;
import org.example.creational.builder.enums.star.TeethStar;
import org.example.creational.builder.enums.star.TypeRearStar;
import org.example.creational.builder.enums.wheels.CompanyWheels;
import org.example.creational.builder.enums.wheels.QuantityWheels;
import org.example.creational.builder.enums.wheels.SizeWheels;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle.Builder()
                .setCompanyBicycle(CompanyBicycle.GT)
                .setFrame(TypeFrame.MOUNTAIN, MaterialFrame.ALUMINUM, SizeFrame.M, ColorFrame.GREEN)
                .setWheels(CompanyWheels.KENDA, SizeWheels.SIZE_29, QuantityWheels.BICYCLE)
                .setBrakes(CompanyBrakes.TEKTRO, TypeBrakes.DISC_BRAKES)
                .setPendant(TypePendant.HARDTAIL)
                .setRearStar(TypeRearStar.CASSETTE, TeethStar.T_11_34)
                .build();
        System.out.println(bicycle);
    }
}
