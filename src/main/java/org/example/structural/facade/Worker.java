package org.example.structural.facade;

public class Worker {
    public void doWork(Warehouse warehouse){
        if (warehouse.iSProductAvailability()){
            System.out.println("рабочий работает");
        }
        else {
            System.out.println("рабочий не работает");
        }
    }
}
