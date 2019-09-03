package designpattern.adapter.mobilecharger;

/**
 * 适配器类(对象适配器）
 * 手机充电器
 */
public class MobileCharger extends Charger {

    private HuaweiChager huaweiChager = new HuaweiChager();
    private IphoneChager iphoneChager = new IphoneChager();

    @Override
    public String iphoneV() {
        return iphoneChager.IphoneChagerV();
    }

    @Override
    public String huaweiV() {
        return huaweiChager.huaweiChager();
    }
}
