package designpattern.factory.abstractfactory;

import designpattern.factory.entity.Bmw;
import designpattern.factory.entity.BmwBoat;
import designpattern.factory.entity.Boat;
import designpattern.factory.entity.Car;

public class BmwFactory implements Factory {
    @Override
    public Boat createBoat() {
        return new BmwBoat();
    }

    @Override
    public Car createCar() {
        return new Bmw();
    }
}
