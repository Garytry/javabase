package designpattern.Singleton;

/**
 * 饿汉式
 * 线程安全
 * 占空间
 */
public class Singleton1 {
   //创建对象
    private static Singleton1 singleton = new Singleton1();
    //私有化构造方法
    private Singleton1(){};
    //获取单例对象的静态方法
    public static Singleton1 getInstance() {
        return singleton;
    }
}
