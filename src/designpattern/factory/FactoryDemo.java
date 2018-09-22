package designpattern.factory;

import com.sun.xml.internal.ws.model.AbstractWrapperBeanGenerator;
import designpattern.factory.abstractfactory.AbstractFactory;
import designpattern.factory.abstractfactory.BeanAbstractFactory;
import designpattern.factory.entity.Cat;
import designpattern.factory.entity.Dog;
import designpattern.factory.entity.Fish;
import designpattern.factory.methodfactory.BeanFactory;
import designpattern.factory.methodfactory.CatFactory;
import designpattern.factory.methodfactory.DogFactory;
import designpattern.factory.methodfactory.FishFactory;
import designpattern.factory.simplefactory.SimpleFactory;

public class FactoryDemo {

    public static void main(String[] args) {
        //简单工厂模式测试
        System.out.println("简单工厂模式测试");
        SimpleFactory.createBean("cat").info();
       SimpleFactory.createBean("dog").info();
       SimpleFactory.createBean("fish").info();
        //工厂方法模式
        System.out.println("工厂方法模式");
        BeanFactory catFactory = new CatFactory();
        catFactory.createBean().info();
        BeanFactory dogFactory= new DogFactory();
        dogFactory.createBean().info();
        BeanFactory fishFactory = new FishFactory();
        fishFactory.createBean().info();
        //抽象工厂模式
        System.out.println("抽象工厂模式");
        AbstractFactory abstractFactory = new BeanAbstractFactory();
        abstractFactory.createBaseEntity().info();
        abstractFactory.createTree().info();

    }
}
