package designpattern.builder.director;

import designpattern.builder.builder.Builder;
import designpattern.builder.product.Product;

/**
 * 指挥者类
 * 指挥者类起到封装的作用，避免高层模块深入到建造者内部的实现类
 * @author gengdesehng
 * @date 2018/8/30
 */
public class Director {

    Builder tvBuild=null;
    public Director(Builder build){
        this.tvBuild=build;
    }
    public Product buildProduct(String partA, String partB, String partC){
        //规范建造流程
        tvBuild.startBuild();
        tvBuild.addPartA(partA);
        tvBuild.addPartB(partB);
        tvBuild.addPartC(partC);
        return tvBuild.buildProduct();
    }

}
