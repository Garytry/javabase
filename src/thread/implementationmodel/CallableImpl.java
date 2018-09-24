package thread.implementationmodel;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author gengdesehng
 * @date 2018/9/24
 */
public class CallableImpl implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("this thread name is:"+Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Object> futureTask = new FutureTask<Object>(new CallableImpl());
        Thread thread = new Thread(futureTask);
        thread.setName("Callable thread");
        thread.start();
        System.out.println("this thread name is:" + futureTask.get());
    }
}
