package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            List<? extends T> machines = (List<? extends T>) new BulldozerProducer().get();
            return new ArrayList<>(machines);
        }
        if (type == Excavator.class) {
            List<? extends T> machines = (List<? extends T>) new ExcavatorProducer().get();
            return new ArrayList<>(machines);
        }
        if (type == Truck.class) {
            List<? extends T> machines = (List<? extends T>) new TruckProducer().get();
            return new ArrayList<>(machines);
        }
        return List.of();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }

    }
}
