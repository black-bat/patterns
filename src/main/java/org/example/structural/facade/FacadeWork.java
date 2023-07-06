package org.example.structural.facade;

public class FacadeWork {
    Worker worker = new Worker();
    Warehouse warehouse = new Warehouse();

    /**
     * с помощью фасада разгружаем клиентскую чать (теперь там меньше кода)
     */
    public void doWork() {
        warehouse.shipping();
        worker.doWork(warehouse);
        warehouse.unloading();
        worker.doWork(warehouse);
    }
}
