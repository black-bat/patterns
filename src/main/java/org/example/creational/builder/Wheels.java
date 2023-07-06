package org.example.creational.builder;


import org.example.creational.builder.enums.wheels.CompanyWheels;
import org.example.creational.builder.enums.wheels.QuantityWheels;
import org.example.creational.builder.enums.wheels.SizeWheels;

public class Wheels {
  private final CompanyWheels company;
  private  final SizeWheels size;
  private final QuantityWheels quantity;

  @Override
  public String toString() {
    return "Wheels{" +
            "company=" + company +
            ", wheels=" + size +
            ", quantity=" + quantity +
            '}';
  }

  public Wheels(CompanyWheels company, SizeWheels size, QuantityWheels quantity) {
    this.company = company;
    this.size = size;
    this.quantity = quantity;

}
}
