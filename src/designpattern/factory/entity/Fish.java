package designpattern.factory.entity;

public class Fish implements BaseEntity {
    @Override
    public void info() {
        System.out.println(this.getClass().getName()+createTime);
    }
}
