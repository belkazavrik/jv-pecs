package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    private static final int LOAD_CAPACITY_MAN_TRUCK = 20;
    private static final int LOAD_CAPACITY_VOLVO_TRUCK = 25;

    @Override
    public List<Truck> get() {

        Truck firstTruck = new Truck();
        firstTruck.setName("MAN TGS");
        firstTruck.setColor("White");
        firstTruck.setLoadCapacity(LOAD_CAPACITY_MAN_TRUCK);

        Truck secondTruck = new Truck();
        secondTruck.setName("VOLVO FH16");
        secondTruck.setColor("Grey");
        secondTruck.setLoadCapacity(LOAD_CAPACITY_VOLVO_TRUCK);

        List<Truck> trucks = new ArrayList<>();

        trucks.add(firstTruck);
        trucks.add(secondTruck);

        return trucks;
    }
}
