package thread.sleep;

public class ThreadDemo {
    public static void main(String[] args){
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        new Thread(mt1,"线程一").start();
        new Thread(mt2,"线程二").start();
        new Thread(mt3,"线程三").start();
    }
}
