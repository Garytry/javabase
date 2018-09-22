package designpattern.factory.simplefactory;

import designpattern.factory.entity.BaseEntity;
import designpattern.factory.entity.Cat;
import designpattern.factory.entity.Dog;
import designpattern.factory.entity.Fish;

/**
 * 简单工厂模式(静态工厂模式)
 * 根据传入的对象类型创建并返回对象
 * 优点：效率高
 * 缺点：需要知道创建的类型，不容易扩展
 */
public class SimpleFactory {

    public static BaseEntity createBean(String beanType){
        BaseEntity obj = null;
          switch (beanType){
              case "cat":
                  obj = new Cat();
                  break;
              case "dog":
                  obj = new Dog();
                  break;
              case "fish":
                  obj = new Fish();
                  break;
              default:
                  obj = null;
          }
        return obj;
    }
}
