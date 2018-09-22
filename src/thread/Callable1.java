package thread;

import java.util.concurrent.*;

public class Callable1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "gary";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> future = new FutureTask<String>(new Callable1());
        new Thread(future).start();
        System.out.println(future.get());

    }
}
