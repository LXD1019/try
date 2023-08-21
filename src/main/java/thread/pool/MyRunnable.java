package thread.pool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("我要一个游泳教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了： " + Thread.currentThread().getName());
        System.out.println("教我游泳,教会后，教练又回到了游泳池");
    }
}
