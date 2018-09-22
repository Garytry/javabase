package designpattern.builder;

import designpattern.builder.builder.Builder;
import designpattern.builder.builder.TvBuilder;
import designpattern.builder.director.Director;
import designpattern.builder.product.TV;

/**
 * @author gengdesehng
 * @date 2018/8/30
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Builder builder = new TvBuilder();
        Director director = new Director(builder);
        TV tv = (TV) director.buildProduct("海尔主体","黑色外壳","液晶显示器");
        tv.doSomeThings();
    }
}
