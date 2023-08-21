package thread.runnable;

public class testDemo {
    public static void main(String[] args) {

        RunnableDemo demo = new RunnableDemo();
        Thread thread = new Thread(demo);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

    }
}
