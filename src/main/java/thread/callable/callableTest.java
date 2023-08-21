package thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class ThreadC implements Callable<String> {

    @Override
    public String call() throws Exception {
        //Thread.sleep(5000);
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("这是线程B");
        return "thread b";
    }
}

public class callableTest {

    public static void main(String[] args) {

        ThreadC threadC = new ThreadC();
        FutureTask<String> task = new FutureTask<>(threadC);
        new Thread(task).start();
        System.out.println("这是主线程：begin！");

        try {
            System.out.println("得到的结果是：" + task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("这是主线程：end！");

    }

}
