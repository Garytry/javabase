package designpattern.proxy;

import designpattern.factory.entity.Cat;
import designpattern.proxy.dynamicproxy.AutoCarShop;
import designpattern.proxy.dynamicproxy.Shop;
import designpattern.proxy.staticproxy.*;

/**
 * 代理模式：
 * 定义：给目标对象提供一个代理对象，并由代理对象控制对目标对象的引用
 * 目的：1.通过代理对象的方式间接访问目标对象，防止直接访问目标对象给系统带来的不必要的复杂性
 *       2.通过带来对象对原有业务增强
 */
public class ProxyDemo {

    public static void main(String[] args) {
        //静态代理
        CatFactory catFactory = new CatFactory();
        AnimalShop shop = new AnimalShop(catFactory);
        shop.getAnimal("white cat");
        //动态代理
        Shop shop1 = new Shop();
        shop1.setFactory(catFactory);
        Factory catFactory1 = (Factory) shop1.getProxyInstance();
        catFactory1.getAnimal("cat");
        DogFactory dogFactory = new DogFactory();
        shop1.setFactory(dogFactory);
        Factory dog = (Factory) shop1.getProxyInstance();
        dog.getAnimal("dog");

        CarShop carShop = new CarShop(new BwmCarfactory());
        carShop.createCar();
        carShop = new CarShop(new AudiCarFactory());
        carShop.createCar();

        AutoCarShop autoCarShop = new AutoCarShop();
        autoCarShop.setProxyFactory(new BwmCarfactory());
        autoCarShop.getProxyFactory().createCar();
        autoCarShop.setProxyFactory(new AudiCarFactory());
        autoCarShop.getProxyFactory().createCar();

    }
}
