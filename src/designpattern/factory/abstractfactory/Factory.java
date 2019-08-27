package designpattern.factory.abstractfactory;

import designpattern.factory.entity.Boat;
import designpattern.factory.entity.Car;

public interface Factory {
    Boat createBoat();
    Car createCar();
}
