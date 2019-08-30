package designpattern.observer;

public class ObserverImpl2 implements Observer {
    @Override
    public void response(String data) {
        System.out.println("服务2："+data);
    }
}
