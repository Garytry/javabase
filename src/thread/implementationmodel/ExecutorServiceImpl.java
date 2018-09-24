package thread.implementationmodel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author gengdesehng
 * @date 2018/9/24
 */
public class ExecutorServiceImpl {

    public static void main(String[] args) {
        ExecutorService executorService =Executors.newCachedThreadPool();
        executorService.submit(new RunableImpl());
        executorService.submit(new CallableImpl());
        executorService.execute(new RunableImpl());
        executorService.submit(()-> System.out.println("gary"));
        executorService.execute(()-> System.out.println("gary"));
        executorService.shutdown();
    }

}
