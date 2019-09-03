package designpattern.adapter.mobilecharger;

/**
 * 苹果手机充电器
 * 适配类(简单的说就是这个类的方法，目标类想要用，我们需要通过适配器获得这个方法）
 */
public class IphoneChager {

    public String IphoneChagerV(){
        return "5v";
    }
}
