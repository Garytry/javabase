package designpattern.adapter.mobilecharger;

/**
 * 目标类(接口、抽象类、具体类）
 * 充电器
 */
public abstract class Charger {

    /**
     * 默认电压
     *
     * @return
     */
    public String defaultVoltage() {
        return "220V";
    }

    /**
     * 苹果手机电压
     *
     * @return
     */
    public abstract String iphoneV();

    /**
     * 华为手机电压
     *
     * @return
     */
    public abstract String huaweiV();

}
