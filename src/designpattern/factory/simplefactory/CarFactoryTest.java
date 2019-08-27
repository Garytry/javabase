package designpattern.factory.simplefactory;

import designpattern.factory.abstractfactory.AudiFactory;
import designpattern.factory.abstractfactory.BmwFactory;
import designpattern.factory.abstractfactory.Factory;

public class CarFactoryTest {

    public static void main(String[] args) {
//        CarFactory.createCar("bmw").run();
//        CarFactory.createCar("audi").run();
//        CarFactory.createCar("benchi");

//        CarFactory bmwCarFactory = new BmwCarFactory();
//        bmwCarFactory.createCar().run();
//        CarFactory audiCarFactory=new AudiCarFactory();
//        audiCarFactory.createCar().run();

        Factory bmwFactory = new BmwFactory();
        bmwFactory.createCar().run();
        bmwFactory.createBoat().move();
        Factory audiFactory = new AudiFactory();
        audiFactory.createCar().run();
        audiFactory.createBoat().move();
    }
}
