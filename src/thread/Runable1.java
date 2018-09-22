package thread;

public class Runable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("gary");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runable1());
        thread.start();
    }
}
