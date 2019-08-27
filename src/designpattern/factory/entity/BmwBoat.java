package designpattern.factory.entity;

public class BmwBoat implements Boat {
    @Override
    public void move() {
        System.out.println("宝马船在滑行");
    }
}
