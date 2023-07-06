package org.example.structural.facade;

public class Warehouse {
    private boolean availability;

    public boolean iSProductAvailability() {
        return availability;
    }

    public void shipping() {
        System.out.println("товар в наличии");
        availability = true;
    }

    public void unloading() {
        System.out.println("товара нет в наличии");
        availability = false;
    }
}
