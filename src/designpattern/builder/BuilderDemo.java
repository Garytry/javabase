package designpattern.builder;

import designpattern.builder.builder.Builder;
import designpattern.builder.builder.CarBuilder;
import designpattern.builder.builder.TvBuilder;
import designpattern.builder.director.Director;
import designpattern.builder.product.Car;
import designpattern.builder.product.Product;
import designpattern.builder.product.TV;

/**
 * @author gengdesehng
 * @date 2018/8/30
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Builder builder = new TvBuilder();
        Director director = new Director(builder);
        Product tv = (TV) director.buildProduct("海尔主体","黑色外壳","液晶显示器");
        tv.doSomeThings();

        builder = new CarBuilder();
        director = new Director(builder);
        Product car = (Car)director.buildProduct("宝马","白色","30万");
        car.doSomeThings();
    }
}
