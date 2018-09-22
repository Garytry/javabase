package java8.interfacedao;

public interface Default {

    default void add () {
        System.out.println("add()");
    }

    void put ();


}
