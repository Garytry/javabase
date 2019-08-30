package designpattern.proxy.staticproxy;

public class CarShop implements ProxyFactory {

    private ProxyFactory proxyFactory;

    public CarShop(ProxyFactory proxyFactory) {
        this.proxyFactory = proxyFactory;
    }

    @Override
    public void createCar() {
        System.out.println("欢迎光临");
        proxyFactory.createCar();
        System.out.println("谢谢惠顾");
    }
}
