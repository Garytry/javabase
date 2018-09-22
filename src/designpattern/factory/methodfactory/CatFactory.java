package designpattern.factory.methodfactory;

import designpattern.factory.entity.BaseEntity;
import designpattern.factory.entity.Cat;

/**
 * Cat对象的工厂类
 */
public class CatFactory implements BeanFactory {
    @Override
    public BaseEntity createBean() {
        return new Cat();
    }
}
