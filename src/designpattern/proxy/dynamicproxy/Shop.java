package designpattern.proxy.dynamicproxy;

import designpattern.proxy.staticproxy.Factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class Shop implements InvocationHandler {
    private Factory factory;

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        hello();
        Object ret = method.invoke(factory,args);
        goodbye();
        return ret;
    }

    private void hello(){
        System.out.println("welcome");
    }
    private void goodbye(){
        System.out.println("goodbye");
    }
}
