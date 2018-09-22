package designpattern.factory.entity;

import java.util.Date;

/**
 * 所有工厂对象需要实现的接口
 * （也可以定义成抽象类）
 */
public interface BaseEntity {
    String createTime = "  createTime:" +new Date();
    void info();
}
