package designpattern.factory.methodfactory;

import designpattern.factory.entity.BaseEntity;
import designpattern.factory.entity.Dog;
/**
 * Dog对象的工厂类
 */
public class DogFactory implements BeanFactory {
    @Override
    public BaseEntity createBean() {
        return new Dog();
    }
}
