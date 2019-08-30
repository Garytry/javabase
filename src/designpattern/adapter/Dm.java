package designpattern.adapter;

public class Dm implements Dbms{

    private Dmdbms dbms = new Dmdbms();

    @Override
    public void dealSql() {
        dbms.dealSql();
    }
}
