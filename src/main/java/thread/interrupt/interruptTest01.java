package thread.interrupt;

public class interruptTest01 implements Runnable {

    public static void main(String[] args) throws Exception {

        Thread thread = new Thread(
                new interruptTest01(),"InterruptDemo Thread"
        );
        System.out.println("Staring thread...");
        thread.start();
        System.out.println("Thread的名字是：" + thread.getName());
        Thread.sleep(3000);
        System.out.println("Interrupting thread...");
        thread.interrupt();
        System.out.println("线程是否中断：" + thread.isInterrupted());
        thread.sleep(3000);
        System.out.println("Stopping application...");

    }

    @Override
    public void run() {
        boolean stop = false;
        while (!stop) {
            System.out.println("My Thread is running...");
            Long time = System.currentTimeMillis();
            while (System.currentTimeMillis() - time < 1000) {

            }

            if (Thread.currentThread().isInterrupted()) {
                break;
            }

        }
    }
}
