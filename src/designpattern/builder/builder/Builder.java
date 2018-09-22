package designpattern.builder.builder;

import designpattern.builder.product.Product;

/**
 * 抽象建造者
 * 如果有多个产品类就有几个具体的建造者，而且这多个产品类具有相同接口或抽象类
 * @author gengdesehng
 * @date 2018/8/30
 */
public interface Builder {

    /**
     * 开始创建方法
     */
    void startBuild();
    //创建方法
    void addPartA(String partA);
    void addPartB(String partB);
    void addPartC(String partC);

    /**
     * 创建产品
     * @return
     */
    Product buildProduct();
}
