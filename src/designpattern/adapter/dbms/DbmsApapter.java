package designpattern.adapter.dbms;

/**
 * 适配器类（类适配器）
 * 数据库
 */
public class DbmsApapter extends Oracle implements Dbms{
    @Override
    public void dealSql() {
        super.dealSql();
    }
}
