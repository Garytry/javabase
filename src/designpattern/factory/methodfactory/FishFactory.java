package designpattern.factory.methodfactory;

import designpattern.factory.entity.BaseEntity;
import designpattern.factory.entity.Fish;
/**
 * Fish对象的工厂类
 */
public class FishFactory implements BeanFactory {
    @Override
    public BaseEntity createBean() {
        return new Fish();
    }
}
