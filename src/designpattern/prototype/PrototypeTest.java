package designpattern.prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("浅克隆测试--------------------------------------------");
        //设置原对象
        ShallowCloneCar shallowCar = new ShallowCloneCar();
        shallowCar.setBrand("宝马");
        shallowCar.setDecorate(new String[]{"宝马发动机", "轮子", "座椅"});
        //获取克隆对象
        ShallowCloneCar shallowCloneCar = (ShallowCloneCar) shallowCar.clone();
        System.out.println("原对象与克隆对象：" + (shallowCar == shallowCloneCar));
        System.out.println(shallowCar.toString());
        System.out.println(shallowCloneCar.toString());
        //更改原对象属性
        shallowCar.setBrand("奥迪");
        shallowCar.getDecorate()[0] = "奥迪发动机";
        System.out.println(shallowCar.toString());
        System.out.println(shallowCloneCar.toString());

        System.out.println("深克隆测试--------------------------------------------");
        //设置原对象
        DeepCloneCar deepCar = new DeepCloneCar();
        deepCar.setBrand("宝马");
        deepCar.setDecorate(new String[]{"宝马发动机", "轮子", "座椅"});
        //获取克隆对象
        DeepCloneCar deepCloneCar = (DeepCloneCar) deepCar.clone();
        System.out.println("原对象与克隆对象：" + (deepCar == deepCloneCar));
        System.out.println(deepCar.toString());
        System.out.println(deepCloneCar.toString());
        //更改原对象属性
        deepCar.setBrand("奥迪");
        deepCar.getDecorate()[0] = "奥迪发动机";
        System.out.println(deepCar.toString());
        System.out.println(deepCloneCar.toString());


    }
}