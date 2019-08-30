package designpattern.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        DbmsApapter dbmsApapter = new DbmsApapter();
        dbmsApapter.dealSql();

        Dm dm = new Dm();
        dm.dealSql();
    }


}
