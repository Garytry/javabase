package designpattern.factory.entity;

public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪汽车启动");
    }
}
