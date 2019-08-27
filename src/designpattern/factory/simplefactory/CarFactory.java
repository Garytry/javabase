package designpattern.factory.simplefactory;

import designpattern.factory.entity.Audi;
import designpattern.factory.entity.Bmw;
import designpattern.factory.entity.Car;

public class CarFactory {

    public static Car createCar(String carType) {
        if ("bmw".equals(carType)) {
            return new Bmw();
        } else if ("audi".equals(carType)) {
            return new Audi();
        } else {
            System.out.println("不能制造");
            return null;
        }

    }
}
