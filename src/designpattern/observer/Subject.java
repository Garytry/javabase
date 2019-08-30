package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void delObserver(Observer observer){
        observers.remove(observer);
    }

    public abstract void watchObserver(String data);

}
