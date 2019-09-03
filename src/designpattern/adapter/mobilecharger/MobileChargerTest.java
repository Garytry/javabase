package designpattern.adapter.mobilecharger;

public class MobileChargerTest {

    public static void main(String[] args) {

        MobileCharger mobileCharger = new MobileCharger();

        System.out.println("默认电压：" + mobileCharger.defaultVoltage());
        System.out.println("苹果手机电压：" + mobileCharger.iphoneV());
        System.out.println("华为手机电压：" + mobileCharger.huaweiV());
    }
}
