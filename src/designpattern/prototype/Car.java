package designpattern.prototype;
/**
 * 原型模式
 */
public class Car implements Cloneable {
    private String classname;

    public String getClassname() {
        return classname;
    }

    public Car(String classname) {
        this.classname=classname;
        System.out.println("具体原型创建成功");
    }
    public  Object clone() throws CloneNotSupportedException{
        System.out.println("原型克隆成功");
        return (Car)super.clone();
    }
}
