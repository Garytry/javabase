package thread.implementationmodel;

/**
 * @author gengdesehng
 * @date 2018/9/24
 */
public class ThreadImpl extends Thread {

    @Override
    public void run() {
        System.out.println("this thread name is:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
      Thread thread = new ThreadImpl();
      thread.setName("thread thread");
      thread.start();
    }
}
