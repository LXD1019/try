package thread.priority;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i  = 0 ; i<50 ; i++) {
            System.out.println(Thread.currentThread().getName() + " 正在工作中……" + i);
        }
    }
}
