package designpattern.proxy.staticproxy;

public class AudiCarFactory implements ProxyFactory {
    @Override
    public void createCar() {
        System.out.println("奥迪汽车");
    }
}
