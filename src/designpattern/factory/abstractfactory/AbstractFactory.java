package designpattern.factory.abstractfactory;

import designpattern.factory.entity.BaseEntity;

/**
 * 抽象工厂实现接口
 */
public interface AbstractFactory {
    BaseEntity createBaseEntity();
    Tree createTree();
}
