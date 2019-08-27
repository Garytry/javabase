package designpattern.factory.entity;

public class AudiBoat implements Boat {
    @Override
    public void move() {
        System.out.println("奥迪船在滑行");
    }
}
