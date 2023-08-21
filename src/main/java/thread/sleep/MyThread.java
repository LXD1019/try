package thread.sleep;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i<90 ; i++) {
            System.out.println(Thread.currentThread().getName() + " 正在工作中……" + i );
            if(i == 20) {
                try {
                    System.out.println(Thread.currentThread().getName() + " 等一会儿就要休息五秒钟了……");
                    Thread.sleep(5000); // 当前线程休眠五秒钟
                    System.out.println(Thread.currentThread().getName() + " 已经休息五秒钟了……");
                }catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " 休眠被打扰了……");
                }
            }
        }
    }
}
