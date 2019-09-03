package designpattern.adapter.mobilecharger;

/**
 * 华为手机充电器
 * 适配类(简单的说就是这个类的方法，目标类想要用，我们需要通过适配器获得这个方法）
 */
public class HuaweiChager {

    public String huaweiChager(){
        return "4.5V";
    }
}
