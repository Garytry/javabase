package designpattern.builder.product;

public class Car implements Product {
    //品牌
    private String brand;
    //颜色
    private String color;
    //价格
    private String price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void doSomeThings() {
        System.out.println("制造出一辆价值"+price+"的"+color+"的"+brand);
    }
}
