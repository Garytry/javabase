package designpattern.observer;

import java.util.Date;

public class ObserverImpl1 implements Observer {
    @Override
    public void response(String data) {
        System.out.println("服务1："+ data);
    }
}
