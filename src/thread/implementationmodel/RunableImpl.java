package thread.implementationmodel;

/**
 * @author gengdesehng
 * @date 2018/9/24
 */
public class RunableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("this thread name is:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunableImpl());
        thread.setName("Runable thread");
        thread.start();
    }
}

