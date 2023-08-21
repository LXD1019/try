package thread.yield;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        Runnable mt1 = new MyThread(mainThread);
        Thread thread1 = new Thread(mt1,"子线程");

        thread1.start();
        for(int i = 0 ; i < 40 ; i++) {
            /*运行情况：*/
			System.out.println(Thread.currentThread().getName() + " *正在工作中……" + i);
        }
    }
}

