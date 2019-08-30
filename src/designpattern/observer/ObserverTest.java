package designpattern.observer;

public class ObserverTest {

    public static void main(String[] args) throws InterruptedException {
        Subject subject = new SubjectImpl();
        subject.addObserver(new ObserverImpl1());
        subject.addObserver(new ObserverImpl2());
        int i = 0;
        while (true){
            subject.watchObserver("第"+i+++"次");
            Thread.sleep(1000);
        }
    }
}
