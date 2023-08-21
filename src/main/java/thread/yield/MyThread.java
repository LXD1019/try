package thread.yield;

public class MyThread implements Runnable{
    private Thread thread = null;
    public MyThread () {}
    public MyThread(Thread thread) {
        this.thread = thread;
    }
    @Override
    public void run() {
        for(int i = 0 ; i<50 ; i++) {
            System.out.println(Thread.currentThread().getName()  + " /正在工作中……" + i);
            if( i  == 30) {
                System.out.println(Thread.currentThread().getName() + " 打算将工作交给 "+thread.getName() + "了……");
                Thread.yield(); // 当前线程让步出去
                System.out.println(Thread.currentThread().getName() + " 又想自己工作了……");
            }
        }
    }
}


