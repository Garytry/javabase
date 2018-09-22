package designpattern.factory.abstractfactory;

public class BigTree implements Tree {
    @Override
    public void info() {
        System.out.println(this.getClass().getName()+createTime);
    }
}
