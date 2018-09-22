package designpattern.Singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        //饿汉式
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println(singleton1);
        System.out.println(Singleton1.getInstance());
        //懒汉式
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton2);
        System.out.println(Singleton2.getInstance());

        //懒汉式（线程安全）
        Singleton3 singleton3 = Singleton3.getInstance();
        System.out.println(singleton3);
        System.out.println(Singleton3.getInstance());

        //懒汉式（双重校验锁）
        Singleton4 singleton4 = Singleton4.getInstance();
        System.out.println(singleton4);
        System.out.println(Singleton4.getInstance());

        //静态内部类
        Singleton5 singleton5 = Singleton5.getInstance();
        System.out.println(singleton5);
        System.out.println(Singleton5.getInstance());

        //枚举
        Singleton6 singleton6 = Singleton6.INSTANCE;
        System.out.println(singleton6);
        System.out.println(Singleton6.INSTANCE);

    }
}
