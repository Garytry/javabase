package designpattern.builder.product;

/**
 * @author gengdesehng
 * @date 2018/8/30
 */
public class TV  implements Product{

    private String ZT;

    private String WK;

    private String XSQ;

    public String getZT() {
        return ZT;
    }

    public void setZT(String ZT) {
        this.ZT = ZT;
    }

    public String getWK() {
        return WK;
    }

    public void setWK(String WK) {
        this.WK = WK;
    }

    public String getXSQ() {
        return XSQ;
    }

    public void setXSQ(String XSQ) {
        this.XSQ = XSQ;
    }

    @Override
    public void doSomeThings() {
        System.out.println("看节目");
    }
}
