package designpattern.observer;

public class SubjectImpl extends Subject{
    @Override
    public void watchObserver(String data) {
        for (Observer observer:observers){
            observer.response(data);
        }
    }
}
