package thread;

public class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("gary");
    }

    public static void main(String[] args) {
        new Thread1().start();
    }

}
