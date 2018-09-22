package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.submit(()-> System.out.println("gary"));
        executor.execute(()-> System.out.println("gary"));
        executor.shutdown();
    }
}
