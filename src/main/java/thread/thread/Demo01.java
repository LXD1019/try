package thread.thread;

public class Demo01 {

    public static void main(String[] args) {

        MyThread myThread = new MyThread("子线程");
        myThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程执行第"+i+"次");
        }

    }

}
