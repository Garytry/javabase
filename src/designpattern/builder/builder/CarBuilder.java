package designpattern.builder.builder;

import designpattern.builder.product.Car;
import designpattern.builder.product.Product;

public class CarBuilder implements Builder{

    Car car = new Car();
    @Override
    public void startBuild() {
        System.out.println("开始生产汽车");
    }

    @Override
    public void addPartA(String partA) {
        System.out.println("选择品牌："+partA);
        car.setBrand(partA);
    }

    @Override
    public void addPartB(String partB) {
        System.out.println("制定颜色："+partB);
        car.setColor(partB);
    }

    @Override
    public void addPartC(String partC) {
        System.out.println("确定价格："+partC);
        car.setPrice(partC);
    }

    @Override
    public Product buildProduct() {
        return car;
    }
}
