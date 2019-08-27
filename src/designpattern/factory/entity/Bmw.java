package designpattern.factory.entity;

public class Bmw implements Car {
    @Override
    public void run() {
        System.out.println("宝马汽车启动");
    }
}
