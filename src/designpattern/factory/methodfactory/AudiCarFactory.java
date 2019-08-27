package designpattern.factory.methodfactory;

import designpattern.factory.entity.Audi;
import designpattern.factory.entity.Car;

public class AudiCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
