package designpattern.factory.abstractfactory;

import designpattern.factory.entity.Audi;
import designpattern.factory.entity.AudiBoat;
import designpattern.factory.entity.Boat;
import designpattern.factory.entity.Car;

public class AudiFactory implements Factory {
    @Override
    public Boat createBoat() {
        return new AudiBoat();
    }

    @Override
    public Car createCar() {
        return new Audi();
    }
}
