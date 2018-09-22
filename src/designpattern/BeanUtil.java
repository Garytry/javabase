package designpattern;

public class BeanUtil {
    public static <T>  T createBean(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        return tClass.newInstance();
    }
}
