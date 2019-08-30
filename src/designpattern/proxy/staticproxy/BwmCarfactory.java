package designpattern.proxy.staticproxy;

public class BwmCarfactory implements ProxyFactory {
    @Override
    public void createCar() {
        System.out.println("宝马汽车");
    }
}
