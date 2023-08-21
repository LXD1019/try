package thread.priority;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable mt1 = new MyThread();
        Runnable mt2 = new MyThread();

        Thread thread1  = new Thread(mt1,"线程一");
        Thread thread2  = new Thread(mt2,"线程二");

        // 设置优先级
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);

        // 启动
        thread1.start();
        thread2.start();
    }
}

