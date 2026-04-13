package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    private static final int WIDTH_BLADE_CAT_BULLDOZER = 5;
    private static final int WIDTH_BLADE_KOMATSU_BULLDOZER = 6;

    @Override
    public List<Bulldozer> get() {

        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setBladeWidth(WIDTH_BLADE_CAT_BULLDOZER);
        firstBulldozer.setName("CAT D11");
        firstBulldozer.setColor("Black");

        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setBladeWidth(WIDTH_BLADE_KOMATSU_BULLDOZER);
        secondBulldozer.setName("KOMATSU D375");
        secondBulldozer.setColor("Brown");

        List<Bulldozer> bulldozers = new ArrayList<>();

        bulldozers.add(firstBulldozer);
        bulldozers.add(secondBulldozer);

        return bulldozers;
    }
}
