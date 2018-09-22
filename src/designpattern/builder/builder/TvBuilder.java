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
        System.out.println("开始制造产品");
    }

    @Override
    public void addPartA(String partA) {
        tv.setZT(partA);
    }

    @Override
    public void addPartB(String partB) {
        tv.setWK(partB);
    }

    @Override
    public void addPartC(String partC) {
        tv.setXSQ(partC);
    }

    @Override
    public Product buildProduct() {
        return tv;
    }
}
