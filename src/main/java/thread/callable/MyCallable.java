package thread.callable;

import java.util.concurrent.Callable;

class MyCallable implements Callable<String> {

    private int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public String call() throws Exception {
        long sum = 0;
        for(int i = 1 ; i <= num ; i++) {
            sum += i;
        }
        return Thread.currentThread().getName()+
                "任务执行的最终结果为："+sum;
    }

}
