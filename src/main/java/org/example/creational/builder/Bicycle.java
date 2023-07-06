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

public class Bicycle {
    private final CompanyBicycle companyBicycle;
    private final Frame frame;
    private final Wheels wheels;
    private final Brakes brakes;
    private final Pendant pendant;
    private final RearStar rearStar;

    public Bicycle(CompanyBicycle companyBicycle, Frame frame, Wheels wheels, Brakes brakes, Pendant pendant, RearStar rearStar) {
        this.companyBicycle = companyBicycle;
        this.frame = frame;
        this.wheels = wheels;
        this.brakes = brakes;
        this.pendant = pendant;
        this.rearStar = rearStar;
    }

    public CompanyBicycle getCompanyBicycle() {
        return companyBicycle;
    }

    public Frame getFrame() {
        return frame;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public Pendant getPendant() {
        return pendant;
    }

    public RearStar getRearStar() {
        return rearStar;
    }

    @Override
    public String toString() {
        return "Велосипед " +
                "компании " + companyBicycle +
                " состоит из:" +
                "\n" + " frame=" + frame +
                "\n" + " wheels=" + wheels +
                "\n" + " brakes=" + brakes +
                "\n" + " pendant=" + pendant +
                "\n" + " rearStar=" + rearStar +
                '}';
    }

    static class Builder {
        private CompanyBicycle companyBicycle;
        private Frame frame;
        private Wheels wheels;
        private Brakes brakes;
        private Pendant pendant;
        private RearStar rearStar;

        public Builder setCompanyBicycle(CompanyBicycle companyBicycle) {
            this.companyBicycle = companyBicycle;
            return this;
        }

        public Builder setFrame(TypeFrame typeFrame, MaterialFrame materialFrame,
                                SizeFrame sizeFrame, ColorFrame colorFrame) {
            frame = new Frame(typeFrame, materialFrame, sizeFrame, colorFrame);
            return this;
        }

        public Builder setWheels(CompanyWheels companyWheels, SizeWheels sizeWheels,
                                 QuantityWheels quantityWheels) {
            wheels = new Wheels(companyWheels, sizeWheels, quantityWheels);
            return this;
        }

        public Builder setBrakes(CompanyBrakes companyBrakes, TypeBrakes typeBrakes) {
            brakes = new Brakes(typeBrakes, companyBrakes);
            return this;
        }

        public Builder setPendant(TypePendant typePendant) {
            pendant = new Pendant(typePendant);
            return this;
        }

        public Builder setRearStar(TypeRearStar typeRearStar, TeethStar teethStar) {
            rearStar = new RearStar(typeRearStar, teethStar);
            return this;
        }

        public Bicycle build() {
            return new Bicycle(companyBicycle,
                    frame,
                    wheels,
                    brakes,
                    pendant,
                    rearStar);
        }
    }
}
