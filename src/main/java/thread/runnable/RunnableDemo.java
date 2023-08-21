package thread.runnable;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {

        int a = 1;
        while (a<10) {
            System.out.println(Thread.currentThread().getName() + a);
            a++;
        }

    }
}
