package designpattern.proxy.dynamicproxy;

import designpattern.proxy.staticproxy.ProxyFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AutoCarShop implements InvocationHandler {
    private ProxyFactory proxyFactory;

    public void setProxyFactory(ProxyFactory proxyFactory) {
        this.proxyFactory = proxyFactory;
    }

    public ProxyFactory getProxyFactory() {
        return proxyFactory;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(proxyFactory.getClass().getClassLoader(),proxyFactory.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("123");
        Object obj = method.invoke(proxyFactory,args);
        System.out.println("456");
        return obj;
    }
}
