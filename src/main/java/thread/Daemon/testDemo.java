package thread.Daemon;

public class testDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread(7);
        MyThread mt2 = new MyThread(100); //守护线程的循环次数远多于用户线程

        Thread thread1 = new Thread(mt1,"用户线程");
        Thread thread2 = new Thread(mt2,"守护线程");
        thread2.setDaemon(true); //thread2设置为守护线程

        thread1.start();
        thread2.start();
    }
}
