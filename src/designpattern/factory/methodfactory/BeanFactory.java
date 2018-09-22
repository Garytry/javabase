package designpattern.factory.methodfactory;

import designpattern.factory.entity.BaseEntity;

/**
 * 抽象工厂类需实现接口
 */
public interface BeanFactory {
    BaseEntity createBean();

}
