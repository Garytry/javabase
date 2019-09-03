package designpattern.Singleton;

/**
 * 懒汉式
 * 线程安全
 * 占空间
 */
public class Singleton2 {
    //创建对象
    private static Singleton2 singleton;

    //私有化构造方法
    private Singleton2() {
    }

    //获取单例对象的静态方法
    public static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
