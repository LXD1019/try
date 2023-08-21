package thread.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {
        // 1.创建一个线程池,指定线程的数量为4
        ExecutorService pools = Executors.newFixedThreadPool(4);
        try{
            long start = System.currentTimeMillis();
            // 2.添加线程任务
            Future<String> t1 = pools.submit(new MyCallable(100000)); // 提交求出1-100000和的线程任务
            Future<String> t2 = pools.submit(new MyCallable(200000)); // 提交求出1-200000和的线程任务
            Future<String> t3 = pools.submit(new MyCallable(300000)); // 提交求出1-300000和的线程任务
            Future<String> t4 = pools.submit(new MyCallable(400000)); // 提交求出1-400000和的线程任务
            Future<String> t5 = pools.submit(new MyCallable(500000)); // 提交求出1-500000和的线程任务
            System.out.println(t1.get());
            System.out.println(t2.get());
            System.out.println(t3.get());
            System.out.println(t4.get());
            System.out.println(t5.get());

            long end = System.currentTimeMillis();
            System.out.println("采用多线程所耗时间为："+(end-start)*1.0/1000+"s");
            start = System.currentTimeMillis();
            long sum = 0;
            for(int i = 1 ; i<=100000 ; i++) {
                sum += i;
            }
            System.out.println("最终结果为："+sum);
            sum = 0;
            for(int i = 1 ; i<=200000 ; i++) {
                sum += i;
            }
            System.out.println("最终结果为："+sum);
            sum = 0;
            for(int i = 1 ; i<=300000 ; i++) {
                sum += i;
            }
            System.out.println("最终结果为："+sum);
            sum = 0;
            for(int i = 1 ; i<=400000 ; i++) {
                sum += i;
            }
            System.out.println("最终结果为："+sum);
            sum = 0;
            for(int i = 1 ; i<=500000 ; i++) {
                sum += i;
            }
            System.out.println("最终结果为："+sum);
            end = System.currentTimeMillis();
            System.out.println("采用单线程所耗时间为："+(end-start)*1.0/1000+"s");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
