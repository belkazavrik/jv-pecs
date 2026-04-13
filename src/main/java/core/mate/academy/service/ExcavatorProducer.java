package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int BUCKET_CAPACITY_HITACHI_EXCAVATOR = 2;
    private static final int BUCKET_CAPACITY_VOLVO_EXCAVATOR = 3;

    @Override
    public List<Excavator> get() {

        Excavator firstExcavator = new Excavator();
        firstExcavator.setName("Hitachi ZX200");
        firstExcavator.setColor("Orange");
        firstExcavator.setBucketCapacity(BUCKET_CAPACITY_HITACHI_EXCAVATOR);

        Excavator secondExcavator = new Excavator();
        secondExcavator.setName("Volvo EC220");
        secondExcavator.setColor("Blue");
        secondExcavator.setBucketCapacity(BUCKET_CAPACITY_VOLVO_EXCAVATOR);

        List<Excavator> excavators = new ArrayList<>();

        excavators.add(firstExcavator);
        excavators.add(secondExcavator);

        return excavators;
    }
}
