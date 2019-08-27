package designpattern.factory.methodfactory;

import designpattern.factory.entity.Bmw;
import designpattern.factory.entity.Car;

public class BmwCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
