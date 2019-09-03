package designpattern.builder.builder;

import designpattern.builder.product.Product;
import designpattern.builder.product.TV;

/**
 * @author gengdesehng
 * @date 2018/8/30
 */
public class TvBuilder implements Builder {
    TV tv = new TV();
    @Override
    public void startBuild() {
        System.out.println("开始制造电视机");
    }

    @Override
    public void addPartA(String partA) {
        System.out.println("电视机主体");
        tv.setZT(partA);
    }

    @Override
    public void addPartB(String partB) {
        System.out.println("电视机外壳");
        tv.setWK(partB);
    }

    @Override
    public void addPartC(String partC) {
        System.out.println("电视机显示器");
        tv.setXSQ(partC);
    }

    @Override
    public Product buildProduct() {
        return tv;
    }
}
