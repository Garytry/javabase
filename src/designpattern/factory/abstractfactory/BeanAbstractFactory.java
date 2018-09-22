package designpattern.factory.abstractfactory;

import designpattern.factory.entity.BaseEntity;
import designpattern.factory.entity.Cat;

/**
 * 抽象工厂实现类
 */
public class BeanAbstractFactory implements AbstractFactory {

    @Override
    public BaseEntity createBaseEntity() {
        return new Cat();
    }

    @Override
    public Tree createTree() {
        return new BigTree();
    }
}
