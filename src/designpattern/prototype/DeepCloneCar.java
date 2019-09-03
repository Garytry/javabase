package designpattern.prototype;

import java.util.Arrays;

/**
 * 原型模式
 * 1.需要实现Cloneable接口
 * 2.覆写Object的clone方法
 */
public class DeepCloneCar implements Cloneable {
    private String brand;

    private String[] decorate;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDecorate(String[] decorate) {
        this.decorate = decorate;
    }

    public String getBrand() {
        return brand;
    }

    public String[] getDecorate() {
        return decorate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneCar car = (DeepCloneCar) super.clone();
        //克隆引用对象
        car.decorate = this.decorate.clone();
        return car;
    }

    @Override
    public String toString() {
        return "brand=" + brand + ";decorate=" + Arrays.toString(decorate);
    }
}
